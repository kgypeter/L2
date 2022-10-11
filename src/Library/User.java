package Library;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    // since name and birthDay are private, they can't be overwritten outside the class User
    private String name; // NULL by default for instance 1
    private LocalDate birthDay; // NULL by default
    private String email;
    private final ArrayList<Book> books = new ArrayList<Book>();

    public User(String name, String birthDay, String email){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public void setBirthDay(String birthDay){
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getEmail(){
        return this.email.toString();
    }

    public void setEmail(){
        this.email = email;
    }


    // methods
    public int age(){
        Period age_user = Period.between(this.birthDay, LocalDate.now());
        return age_user.getYears();
    }

    public void printInfo(){
        System.out.printf("%s was born in %s and he is now %d years old.",
                this.name, this.birthDay.toString(), this.age());
    }

    public void borrow(Book book){
        this.books.add(book);
    }

    public String borrowedBooks(){
        return this.books.toString();
    }

}
