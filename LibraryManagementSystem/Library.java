import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed successfully: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with title containing: " + title);
        }
    }

    public void issueBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book issued successfully: " + book.getTitle());
                } else {
                    System.out.println("Book is already issued: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully: " + book.getTitle());
                } else {
                    System.out.println("Book was not issued: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\n===== Library Books =====");
            for (Book book : books) {
                System.out.println(book);
            }
            System.out.println("========================\n");
        }
    }
}
