package ood.librarymanagement.model;

import ood.librarymanagement.constants.Constant;

import java.util.Date;
import java.util.List;

public class Member extends Account{

    private Date dateOfMembership;
    private int totalBooksCheckedOut;

//    List<Book> borrowedBook;
//    List<Book> reservedBook;
    Integer ownedFee;

    public int getTotalBooksCheckedout(){
        return this.totalBooksCheckedOut;
    };

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }

    public Integer getOwnedFee() {
        return ownedFee;
    }

    public void setOwnedFee(Integer ownedFee) {
        this.ownedFee = ownedFee;
    }
}
