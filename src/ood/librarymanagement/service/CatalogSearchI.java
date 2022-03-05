package ood.librarymanagement.service;

import ood.librarymanagement.model.Book;

import java.util.List;

public interface CatalogSearchI {
    public List<Book> searchByTitle(String bookTitle);
    public List<Book>  searchByAuthor(String bookAuthor);
    public List<Book>  searchBySubjectName(String subjectName);
    public List<Book>  searchByPublicationDate(String publicationDate);
}
