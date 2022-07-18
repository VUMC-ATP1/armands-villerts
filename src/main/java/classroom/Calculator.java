package classroom;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        char operator;

        System.out.println("input value for a");
        a = scanner.nextInt();
        System.out.println("input operator");
        operator = scanner.next().charAt(0);
        System.out.println("input value for a");
        b = scanner.nextInt();

        if(operator == '+') {
            System.out.printf("Result: %d\n", a + b);;
        } else if (operator == '-') {
            System.out.printf("Result: %d\n", a - b);
        } else if (operator == '*') {
            System.out.printf("Result: %d\n", a * b);
        } else if (operator == '/') {
            System.out.printf("Result: %d\n", a /b);
        }
    }
}