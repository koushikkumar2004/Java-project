import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }
}

public class LibraryManagementSystem {
    private ArrayList<Book> books;

    public LibraryManagementSystem() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book \"" + title + "\" added to the library.");
    }

    public void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            String status = book.isBorrowed() ? "Borrowed" : "Available";
            System.out.println("- " + book.getTitle() + " (" + status + ")");
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You have successfully borrowed \"" + title + "\".");
                    return;
                } else {
                    System.out.println("Sorry, \"" + title + "\" is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book \"" + title + "\" not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You have successfully returned \"" + title + "\".");
                    return;
                } else {
                    System.out.println("The book \"" + title + "\" was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book \"" + title + "\" not found in the library.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem library = new LibraryManagementSystem();

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title to add: ");
                    String addTitle = scanner.nextLine();
                    library.addBook(addTitle);
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter the book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("Enter the book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
