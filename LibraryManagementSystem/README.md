# Library Management System

A basic Java console application for managing a library's book collection.

## Features

- **Add Book**: Add new books to the library with title, author, and ISBN
- **Remove Book**: Remove books from the library using ISBN
- **Search Book**: Search for books by title
- **Issue Book**: Mark a book as issued to a borrower
- **Return Book**: Mark an issued book as returned
- **Display All Books**: View all books in the library with their availability status

## Classes

### Book.java
Represents a book with the following properties:
- Title
- Author
- ISBN
- Availability status

### Library.java
Manages the collection of books and provides methods for:
- Adding and removing books
- Searching books
- Issuing and returning books
- Displaying all books

### LibraryManagementSystem.java
Main class with a console-based user interface for interacting with the library.

## How to Run

1. Navigate to the LibraryManagementSystem directory:
```bash
cd LibraryManagementSystem
```

2. Compile all Java files:
```bash
javac *.java
```

3. Run the program:
```bash
java LibraryManagementSystem
```

## Usage

Once the program starts, you will see a menu with the following options:

1. Add Book - Enter book details (title, author, ISBN)
2. Remove Book - Enter the ISBN of the book to remove
3. Search Book - Enter title or part of title to search
4. Issue Book - Enter ISBN to mark book as issued
5. Return Book - Enter ISBN to mark book as returned
6. Display All Books - View all books and their status
7. Exit - Close the program

## Example

```
===== Welcome to Library Management System =====

1. Add Book
2. Remove Book
3. Search Book
4. Issue Book
5. Return Book
6. Display All Books
7. Exit
Enter your choice: 1
Enter book title: Introduction to Java
Enter book author: John Doe
Enter book ISBN: 978-0-123456-78-9
Book added successfully: Introduction to Java
```
