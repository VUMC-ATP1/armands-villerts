package classroom.chaining;

public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty = 0;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book {" +
                "isbn: '" + isbn + '\'' +
                ", name: '" + name + '\'' +
                ", author: " + author +
                ", price: " + price +
                ", qty: " + qty +
                '}';
    }

    public Book() {
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
}
