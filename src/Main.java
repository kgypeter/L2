import Library.Book;
import Library.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Peter Smith", "2002-01-12", "user@gmail.com"); // User object
//
        user1.printInfo();
        System.out.printf("\n"+user1.getName()+"'s email address is: "+user1.getEmail()+"\n");

        Book book1 = new Book("Sapiens", "Yuval Noah Harari", 443, "02.14.2018", "English");
//        user1.borrow(book1);
        book1.bookToString();
        System.out.println("\n"+book1.getLanguage());

        System.out.println();
        System.out.printf("%s has borrowed these books: %s.",
                user1.getName(), user1.borrowedBooks());

    }
}