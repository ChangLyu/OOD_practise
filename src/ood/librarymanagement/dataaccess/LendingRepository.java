package ood.librarymanagement.dataaccess;

import ood.librarymanagement.model.BookLending;

public class LendingRepository {

    public BookLending fetchLendingDetails(String barCode){
        // read from db
        return new BookLending();
    }

}
