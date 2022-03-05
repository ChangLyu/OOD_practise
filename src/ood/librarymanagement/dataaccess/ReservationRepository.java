package ood.librarymanagement.dataaccess;

import ood.librarymanagement.model.BookReservation;

public class ReservationRepository {
    public BookReservation fetchReservationDetails(String barCode){
        // read from db
        return new BookReservation();
    }

    public boolean reserveBook(String barCode, String memberId){
        return true;
    }
}
