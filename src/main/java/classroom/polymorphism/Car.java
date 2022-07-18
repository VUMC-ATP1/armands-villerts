package classroom.polymorphism;

public class Car extends Vehicle{
    @Override
    public void move() {
        super.move();
    }

    public void stop() {
        System.out.println("Stop from " + this.getClass().getName());
    }
}
