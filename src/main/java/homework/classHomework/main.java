package homework.classHomework;

public class main {
    public static void main(String[] args) {
        Trissturis triangle1 = new Trissturis(12,15,23);
        System.out.println(triangle1.area);
        System.out.println(triangle1.calculateAre());
        System.out.println(triangle1.isEquilateral());
        System.out.println(triangle1.isIsosceles());

        Trissturis triangle2 = new Trissturis();
        triangle2.sideA = 3;
        triangle2.sideB = 4;
        triangle2.sideC = 5;
        System.out.println(triangle2.calculateAre());
        System.out.println(triangle2.isEquilateral());
        System.out.println(triangle2.isIsosceles());
    }
}
