package ood.librarymanagement.model;

import ood.librarymanagement.constants.BookStatus;

import java.util.Date;

public class BookItem extends Book{
    private String barCode;
    private boolean isReferenceOnly;
    private Date borrowedDate;
    private Date dueDate;
    private Rack location;
    private BookStatus status;

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public void setReferenceOnly(boolean referenceOnly) {
        isReferenceOnly = referenceOnly;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Rack getLocation() {
        return location;
    }

    public void setLocation(Rack location) {
        this.location = location;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
