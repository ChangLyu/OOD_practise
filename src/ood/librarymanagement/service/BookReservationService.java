package ood.librarymanagement.service;

import ood.librarymanagement.constants.BookStatus;
import ood.librarymanagement.constants.Constant;
import ood.librarymanagement.constants.ReservationStatus;
import ood.librarymanagement.dataaccess.BookRepository;
import ood.librarymanagement.dataaccess.LendingRepository;
import ood.librarymanagement.dataaccess.PersonRepository;
import ood.librarymanagement.dataaccess.ReservationRepository;
import ood.librarymanagement.model.BookItem;
import ood.librarymanagement.model.BookLending;
import ood.librarymanagement.model.BookReservation;
import ood.librarymanagement.model.Member;

import java.util.Date;

public class BookReservationService {

    BookRepository bookRepository = new BookRepository();
    PersonRepository personRepository = new PersonRepository();
    ReservationRepository reservationRepository = new ReservationRepository();
    LendingRepository lendingRepository = new LendingRepository();

    public boolean reserveBookItem(BookItem bookItem, String memberId){
        return reservationRepository.reserveBook(bookItem.getBarCode(),memberId);
    }

    public boolean checkoutBook(String memberId, String barCode){

        BookItem bookItem = bookRepository.getBookByBarCode(barCode);
        Member member = personRepository.getMemberById(memberId);
        if(member.getTotalBooksCheckedout() >= Constant.MAX_BOOKS_ISSUED_TO_A_USER) {
            // user already checkout max number of book
            return false;
        }
        BookReservation bookReservation = reservationRepository.fetchReservationDetails(barCode);
        if (bookReservation != null && bookReservation.getMemberId() != memberId) {
            // reserverd by other person
            return false;
        }else if(bookReservation != null){
            // book is reserved by current user
            // update reservation status in db
            bookReservation.setStatus(ReservationStatus.COMPLETE); // ?????
        }
        if(bookItem.isReferenceOnly()) {
            // ShowError("This book is Reference only and can't be issued");
            return false;
        }
        // todo

        // update bookitem status in db
        bookRepository.updateBookStatus(barCode, BookStatus.LOANED);

        // update member in db
        personRepository.updatePersonTotalBooksCheckedOut(member.getTotalBooksCheckedOut()+1);

        return true;

    }


    public boolean renewBookItem(BookItem bookItem){
        return false;
    }
    public boolean returnBookItem(BookItem bookItem){
        return false;
    }

    public  void collectFine(String memberId, String barCode) {
        BookLending bookLending= lendingRepository.fetchLendingDetails(barCode);
        Date dueDate = bookLending.getDueDate();
        Date today = new Date();

        if (today.compareTo(dueDate) > 0) {
            long diff = today.getTime() - dueDate.getTime();
            long diffDays = diff/(24*60*60*1000);
            // Fine.collectFine(memberId, diffDays);
        }

    }
}
