package classroom.polymorphism;

public class Example {
    public static void main(String[] args) {
        Calculator kalkulators1 = new Calculator();

        System.out.println(kalkulators1.add(5, 3));
        System.out.println(kalkulators1.add(5, 3, 9));
        System.out.println(kalkulators1.add(2.5, 7.5));

        Car automobile1 = new Car();
        automobile1.move();

        Vehicle automobile2 = new Car();
        automobile2.move();

        Vehicle automobile3 = new Vehicle();
        automobile3.move();


        Customer client1 = new Customer(1, "John Doe", 15);
        Invoice invoice1 = new Invoice(1, client1, 1000);
        System.out.println(invoice1.getAmountAfterDiscount());
        System.out.println(invoice1.toString());
    }
}
