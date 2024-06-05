package lt.techin.library.pt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookCatalogVykintasD implements BookCatalog {

    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException();
        }
        if (book.getTitle() == null||book.getTitle().isEmpty()){
            throw new IllegalArgumentException();
        }
        if (book.getIsbn() == null || book.getIsbn().isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                return;
            }
        }
        books.add(book);
    }

    @Override
    public int getTotalNumberOfBooks() {
        return books.size();
    }

    @Override
    public void printBookTitles() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }

    }

    @Override
    public void printTitlesOfBooksPublishedAfter(int i) {
            for (Book book : books) {
                if (book.getPublicationYear() > i) {
                    System.out.println(book.getTitle());
                }
            }
        }


    @Override
    public Book getBookByIsbn(String s) throws BookNotFoundException {
        for (Book b : books) {
            if (b.getIsbn().equals(s)) {
                return b;
            }
        }
        throw new BookNotFoundException("No book");
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {
        for (Book b : books) {
            if (b.getAuthor().equals(null)) {
                return null;
            }
        }
        return books.stream().filter(x -> x.getAuthor().equals(s)).collect(Collectors.toList());
    }



    @Override
    public boolean isBookInCatalog(String s) {
        for (Book b:books) {
            if(b.getIsbn().equals(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isBookAvailable(String s) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isAvailable()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < books.size(); i++) {
            sum = sum + books.get(i).getPrice();
        }
        return sum;
    }

    @Override
    public double calculateAveragePrice() {
        double sum = 0.0;
        for (int i = 0; i < books.size(); i++) {
            sum = sum + books.get(i).getPrice();
        }
        return sum / books.size();
    }

    @Override
    public List<Book> getSortedBooks() {
        return books.stream().sorted(Comparator.comparing(Book::getPublicationYear)).collect(Collectors.toList());
    }

    @Override
    public List<Book> searchBooksByTitleContaining(String s) {

        if(s.equals(null) || s.isEmpty()){
            return null;
        }
       else   {
            return books.stream()
                    .filter(book -> book.getTitle().toUpperCase().contains(s.toUpperCase()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public Book findNewestBookByPublisher(String s) {
//        List<Book> newBooks= new ArrayList<>();
//        for (Book book : books) {
//            if (book.getPublisher()>newBooks) {
//                newBooks.add(book);
//            }
//        }
//        return newBooks;
//        if (s == null) {
//            throw new IllegalArgumentException();
//        }
//        if (s.isEmpty()) {
//            throw new IllegalArgumentException();
        return null;
    }


    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (predicate.test(book)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
//        return books.stream().map(x->x.getPublisher())
        return null;
    }
}
