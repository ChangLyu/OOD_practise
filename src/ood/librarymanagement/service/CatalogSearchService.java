package ood.librarymanagement.service;

import ood.librarymanagement.model.Book;

import java.util.HashMap;
import java.util.List;

public class CatalogSearchService implements CatalogSearchI{
    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> bookPublicationDates;
    @Override
    public List<Book> searchByTitle(String bookTitle) {
        return bookTitles.get(bookTitle);
    }

    @Override
    public List<Book>  searchByAuthor(String bookAuthor) {
        return null;
    }

    @Override
    public List<Book>  searchBySubjectName(String subjectName) {
        return null;
    }

    @Override
    public List<Book>  searchByPublicationDate(String publicationDate) {
        return null;
    }
}
