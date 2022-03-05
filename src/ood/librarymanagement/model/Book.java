package ood.librarymanagement.model;

import java.util.Date;
import java.util.List;

public class Book {
    String bookId;
    String bookTitle;
    String subject;
    String language;
    List<Author> authors;
    Date publicationDate;
}
