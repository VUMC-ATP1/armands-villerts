package classroom.chaining;

public class Example {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.setBrand("Audi");
        car1.setEngine("Petrol");
        car1.setColor("White");
        car1.setYearOfProduction(2020);
        car1.setPrice(30000);

        Vehicle car2 = new Vehicle();
        car2.setBrand("Volvo").setEngine("Diesel").setColor("Blue").setYearOfProduction(2015).setPrice(25000).start();

        Person johnDoe = Person.builder().name("John Doe").city("Riga").job("unemployed").build();

        Book gramata1 = new Book();
        gramata1.name = "Harry Potter";
        gramata1.isbn = "059035342X";
        gramata1.author = new Author("J.K. Rowling", "dumbledore@hogwarts.com");
        gramata1.price = 10.99;
        gramata1.qty = 2;
        System.out.println(gramata1.toString());

        Author rowling = new Author("J.K. Rowling", "dumbledore@hogwarts.com");
        Book gramata2 = new Book("059035342X", "Harry Potter", rowling, 20.99, 3);
        System.out.println(gramata2.toString());

        Book gramata3 = new Book("059035342X", "Harry Potter", new Author("J.K. Rowling", "dumbledore@hogwarts.com"), 30.99, 4);
        System.out.println(gramata3.toString());

    }
}
