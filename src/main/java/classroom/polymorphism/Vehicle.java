package classroom.polymorphism;

public class Vehicle {
    public void move() {
        System.out.println("Move from " + this.getClass().getName());
    }
}
