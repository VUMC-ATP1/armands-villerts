package classroom.objects;

public class Circle {
    static double pi = 3.14;
    static double radius;

    public Circle() {
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }
    public double calculateArea(double radius){
        return pi * Math.pow(radius, 2);
    }

}
