import java.util.Arrays;

public class Library {
private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] add(Book bookToAdd, Book[] arrayToAddBook) {
        Book[] newArray = Arrays.copyOf(arrayToAddBook, arrayToAddBook.length + 1);
        newArray[arrayToAddBook.length - 1] = bookToAdd;
        return newArray;
    }

    public Book[] remove(int indexInArrayOfTheBook) {
        for (int i = indexInArrayOfTheBook; i < books.length - 1; i++) {
            books[i] = books[i + 1];
        }
        books[books.length - 1] = null;
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public  void list(){
        for (Book i : books) {
            if (i != null) {
                System.out.println(i.toString());
            }
        }
    }

}
