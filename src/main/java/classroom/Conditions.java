package classroom;

public class Conditions {
    public static void main(String[] args) {
        if (2 > 1) {
            System.out.println("Got here!");
        }

        int x = 100;
        if (x >= 100) {
            System.out.println("x is greater or equal 100");
        } else {
            System.out.println("x is not greater or equal 100");
        }
        System.out.println("That's all folks!");

        int y = 100;
        if (x <= 100) {
            System.out.println("x is less or equal 100");
        } else if (x == 100) {
            System.out.println("x is 100");
        }

        if (x <= 100) {
            System.out.println("x is less or equal 100");
        } else {
            System.out.println("x is not less or equal 100");
        }

        if (x == 100) {
            System.out.println("x is 100");
        } else {
            System.out.println("x is not 100");
        }

        int number = 3;
        switch(number) {
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            case 3:
                System.out.println("number is 3");
                break;
            case 4:
                System.out.println("number is 4");
                break;
            default:
                System.out.println("number is out of range");
        }

    }
}