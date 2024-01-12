// 2. Using the correct syntax in Java, define a class called Book that contains three data members: bookId, title, and author, and two member functions: void input() to assign input values and void display() to display the values. Appropriate data types are to be chosen. Using the correct syntax in Java, show how a subclass called AudioBook can be derived from the class Book to include additional data members length and narrator. Appropriate data types are to be chosen. Create a main class which contains main method. In this method, Create an array of the AudioBook class to store 3 objects. Display the details of the audiobook which has the highest length.

class Book_ESE {
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
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class AudioBook_ESE extends Book_ESE {
    int length;
    String narrator;

    void input(int bookId, String title, String author, int length, String narrator) {
        super.input(bookId, title, author);
        this.length = length;
        this.narrator = narrator;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Narrator: " + narrator);
    }
}

class BookMain_ESE {
    public static void main(String[] args) {
        AudioBook_ESE[] audioBooks = new AudioBook_ESE[3];

        audioBooks[0] = new AudioBook_ESE();
        audioBooks[0].input(1, "Book 1", "Author 1", 100, "Narrator 1");

        audioBooks[1] = new AudioBook_ESE();
        audioBooks[1].input(2, "Book 2", "Author 2", 200, "Narrator 2");

        audioBooks[2] = new AudioBook_ESE();
        audioBooks[2].input(3, "Book 3", "Author 3", 300, "Narrator 3");

        int maxIndex = 0;
        for (int i = 1; i < audioBooks.length; i++) {
            if (audioBooks[i].length > audioBooks[maxIndex].length) {
                maxIndex = i;
            }
        }

        System.out.println("Audio Book with the highest length");
        audioBooks[maxIndex].display();
    }
}