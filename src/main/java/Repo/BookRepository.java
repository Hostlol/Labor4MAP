package Repo;

import Domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public List<Book> books = new ArrayList<>();
    public int bookIdCounter = 1;

    public void addBook(Book book) {
        book.setBookId(bookIdCounter);
        books.add(book);
        bookIdCounter++;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void printAllBooks() {
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

    public void removeBook(int bookId) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
        }
    }
    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null; // Return null if the book with the given ID is not found
    }
}
