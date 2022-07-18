package classroom.objects;

public class objectsPractice {
    public static void main(String[] args) {
        Car aventador = new Car("Lamborghini", "Coupe", 5.0, 24, 2, true);
        aventador.brand = "Lamborghini";
        aventador.bodyType = "Coupe";
        aventador.engineDisplacement = 5.0;
        aventador.wheelSize = 24;
        aventador.seatCount = 2;
        aventador.is4WheelDrive = true;
        System.out.println(aventador.engineDisplacement);
        System.out.println(aventador.bodyType);

        Car urus = new Car("Lamborghini", "SUV", 4.0, 22, 5, true);
        System.out.println(urus.engineDisplacement);
        System.out.println(urus.bodyType);

        Company google = new Company();
        System.out.println(google.industry);

        Circle justCircle = new Circle();
        justCircle.radius = 1000;
        System.out.println(justCircle.radius);
        System.out.println(justCircle.calculateArea(100));

        Circle anotherCircle = new Circle(33);
        System.out.println(anotherCircle.radius);
        System.out.println(anotherCircle.calculateArea());

        System.out.println("----- PezDispenser -----");
        PezDispenser candy1 = new PezDispenser("Pez1");
        System.out.println("Eat one candy");
        System.out.println("Candies left " + candy1.eatOne());
        System.out.println("-----");
        System.out.println("Eat 12 candies");
        System.out.println("Candies left " + candy1.eatSome(12));
        System.out.println("-----");
        System.out.println("Eat 5 candies");
        System.out.println("Candies left  " + candy1.eatSome(5));
        System.out.println("-----");
        System.out.println("Fill up with 7 candies");
        System.out.println("Candies left " + candy1.fillUp(7));
        System.out.println("-----");
        System.out.println("Fill up with 3 candies");
        System.out.println("Candies left " + candy1.fillUp(3));
        System.out.println("-----");
        System.out.println("Fill up full");
        System.out.println("Candies left " + candy1.fillUpFull());
        System.out.println(candy1.toString());

        Dog reksis = new Dog();

    }
}
