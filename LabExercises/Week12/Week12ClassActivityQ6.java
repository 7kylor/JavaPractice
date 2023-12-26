// 6.	 Using the correct syntax in java, define a class called Book that contains three data members: bookId, title, and author, and two member functions: void input() to assign input values and void display() to display the values. Appropriate data types are to be chosen.Using the correct syntax in Java, show how a subclass called AudioBook can be derived from the class Book to include additional data members length and narrator. Appropriate data types are to be chosen. 

class Book {
    int bookId;
    String title;
    String author;

    void input(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }
}

class AudioBook extends Book {
    int length;
    String narrator;

    void input(int bookId, String title, String author, int length, String narrator) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.length = length;
        this.narrator = narrator;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Length: " + length);
        System.out.println("Book Narrator: " + narrator);
    }
}

class Week12ClassActivityQ6 {
    public static void main(String[] args) {
        Book book = new Book();
        book.input(1, "The Lord of the Rings", "J. R. R. Tolkien");
        book.display();

        AudioBook audioBook = new AudioBook();
        audioBook.input(2, "The Lord of the Rings", "J. R. R. Tolkien", 1178, "Rob Inglis");
        audioBook.display();
    }
}
