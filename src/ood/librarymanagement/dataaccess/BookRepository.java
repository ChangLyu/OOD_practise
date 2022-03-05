package ood.librarymanagement.dataaccess;

import ood.librarymanagement.constants.BookStatus;
import ood.librarymanagement.model.BookItem;

public class BookRepository {

    public BookItem getBookByBarCode(String bookId){
        // read from book database
        return new BookItem();
    }

    public boolean updateBookStatus(String barCode, BookStatus status) {
        return true;
    }
}
