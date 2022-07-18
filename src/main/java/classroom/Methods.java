package classroom;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        doSomething("Nobody",99);

//        Scanner yourAge = new Scanner(System.in);
//        System.out.println("State you age");
//        int age = yourAge.nextInt();
//        ageCheck(age);

//        System.out.println(sumNumbers(10, 15, 25));
//        int summa = sumNumbers(5, 10, 15);

        System.out.printf("Adult: %b", isAdult(20));

//        Scanner calculator = new Scanner(System.in);
//        System.out.println("First number:");
//        int number1 = calculator.nextInt();
//        System.out.println("Operator:");
//        String operator = calculator.next();
//        System.out.println("Second number");
//        int number2 = calculator.nextInt();
//        switch (calculator) {
//            case '+':
//                return addition(number1, number2);
//            case '-':
//                return subtraction(number1, number2);
//            default:
//                System.out.println("Tired");
//        }
    }

    public static void doSomething(String name, int age) {
        System.out.printf("You are %s, aged %d\n", name, age);
    }

    public static void ageCheck(int ageNum) {

        if (ageNum < 0) {
            System.out.println("Are you kidding?");
        } else if (ageNum >= 14 && ageNum <= 16) {
            System.out.println("Still too young");
        } else if (ageNum == 17) {
            System.out.println("Wait a few more years");
        } else if (ageNum == 18) {
            System.out.println("Run for the bar");
        } else if (ageNum > 100) {
            System.out.println("Congratulations Centennial!");
        }

    }

    public static int sumNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
}
