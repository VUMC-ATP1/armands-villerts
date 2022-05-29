package homework.homeworkTwo;

import java.util.List;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println("---= Task 1 =---");
        Scanner number = new Scanner(System.in);
        System.out.println("Input number");
        int num = number.nextInt();
        System.out.println("Number is bigger than 0: " + (num > 0));
        System.out.println("Number is smaller than 0: " + (num < 0));
        System.out.println("Number is bigger than 5 and smaller or equal to 10: " + (num > 5 && num <= 10));
        System.out.println("Number equals 0 or number is 10: " + (num == 0 || num == 10));
        System.out.println("Number squared is bigger than 10: " + ((num * num) > 10));

        System.out.println("---= Task 2 =---");
        Scanner month1 = new Scanner(System.in);
        System.out.println("Input month number");
        int monthNum1 = month1.nextInt();
        switch (monthNum1) {
            case 1 -> System.out.println("1st month is January");
            case 2 -> System.out.println("2nd month is February");
            case 3 -> System.out.println("3rd month is March");
            case 4 -> System.out.println("4th month is April");
            case 5 -> System.out.println("5th month is May");
            case 6 -> System.out.println("6th month is June");
            case 7 -> System.out.println("7th month is July");
            case 8 -> System.out.println("8th month is August");
            case 9 -> System.out.println("9th month is September");
            case 10 -> System.out.println("10th month is October");
            case 11 -> System.out.println("11th month is November");
            case 12 -> System.out.println("12th month is December");
            default -> System.out.println("Incorrect month number");
        }

        System.out.println("---= Task 2 but faster =---");
        List<String> months = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        Scanner month2 = new Scanner(System.in);
        System.out.println("Input month number");
        int monthNum2 = month2.nextInt();
        if (monthNum2 > 0 && monthNum2 <= months.size()) {
            System.out.println("Month is: " + months.get(monthNum2 - 1));
        } else {
            System.out.println("Incorrect month number");
        }

        System.out.println("---= Task 3 =---");
        Scanner biggest = new Scanner(System.in);
        System.out.println("Input first value");
        int num1 = biggest.nextInt();
        System.out.println("Input second value");
        int num2 = biggest.nextInt();
        System.out.println("Input third value");
        int num3 = biggest.nextInt();
        System.out.printf("Biggest number is: " + Math.max((Math.max(num1, num2)), num3));

        System.out.println("---= Task 4 =---");
        Scanner colorIn = new Scanner(System.in);
        System.out.println("Input color green, yellow or red");
        String color = colorIn.next();
        if (color.equalsIgnoreCase("green")) {
            System.out.println("Good to go");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Be ready");
        } else if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop!");
        } else {
            System.out.println("Incorrect color");
        }

        System.out.println("---= Task 5 =---");
        for (int i = 0; i < 3; i++){
            printBusinessCard();
        }

        System.out.println("---= Task 6 =---");
        printBusinessCardTwo("John", "Doe", "555 1234567", 1990);
        printBusinessCardTwo("Jane", "Doe", "555 7654321", 1991);

        System.out.println("---= Task 7 =---");
        int sum = sumOfTwo(2, 2);
        System.out.println("2 + 2 = " + sum);

        System.out.println("---= Task 8 =---");
        System.out.println("Average of three: " + average(12, 19, 31));
    }

    public static void printBusinessCard() {
        System.out.print("""
                Business card
                +++++++++++++
                First Name: John
                Last name: Doe
                Phone: 555 1234567
                Born: 1990
                ++++++++++++++++++
                """);
    }

    public static void printBusinessCardTwo(String firstName, String lastName, String phone, int yearOfBirth) {
        System.out.printf("""
                Business card
                +++++++++++++
                First Name: %s
                Last name: %s
                Phone: %s
                Born: %d
                ++++++++++++++++++
                """, firstName, lastName, phone, yearOfBirth);
    }

    public static int sumOfTwo(int x, int y) {
        return x + y;
    }

    public static double average(double a, double b, double c) {
        return ((a + b + c) / 3);
    }
}

