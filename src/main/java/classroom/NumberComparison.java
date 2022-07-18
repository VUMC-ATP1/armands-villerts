package classroom;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("input value for a");
        a = scanner.nextInt();
        if(a > 0) {
            System.out.printf("Your input %d is greater than 0\n", a);
        } else if(a == 0) {
            System.out.printf("Your input is 0\n");
        } else if(a < 0)
            System.out.printf("Your input %d is less than 0\n", a);

        Scanner median = new Scanner(System.in);
        int b, c, d;
        System.out.println("input value for b");
        b = median.nextInt();
        System.out.println("input value for c");
        c = median.nextInt();
        System.out.println("input value for d");
        d = median.nextInt();
        System.out.printf("Median value is: %d\n", ((b + c + d) / 3));

        Scanner lowest = new Scanner(System.in);
        int x, y, z;
        System.out.println("input value for x");
        x = lowest.nextInt();
        System.out.println("input value for y");
        y = lowest.nextInt();
        System.out.println("input value for z");
        z = lowest.nextInt();
        int firstMin = Math.min(x,y);
        int secondMin = Math.min(firstMin, z);
        System.out.printf("Lowest number is: %d",secondMin);

        Scanner evenOdd = new Scanner(System.in);
        int w;
        System.out.println("input value for w");
        w = evenOdd.nextInt();
        if(w % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        Scanner weekday = new Scanner(System.in);
        int dayNumber;
        System.out.println("Please input value for week day");
        dayNumber = weekday.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday is workday");
                break;
            case 2:
                System.out.println("Tuesday is workday");
                break;
            case 3:
                System.out.println("Wednesday is workday");
                break;
            case 4:
                System.out.println("Thursday is workday");
                break;
            case 5:
                System.out.println("Friday is workday");
                break;
            case 6:
                System.out.println("Saturday is weekend");
                break;
            case 7:
                System.out.println("Sunday is weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }

        Scanner months = new Scanner(System.in);
        String monthName;
        System.out.println("Please input value for month");
        monthName = months.nextLine().toLowerCase();
        switch (monthName) {
            case "january":
                System.out.println("January is the 1st month");
                break;
            case "february":
                System.out.println("February is the 2nd month");
            default:
                System.out.println("Running out of patience");
        }

        Scanner operators = new Scanner(System.in);
        String operator;
        Scanner numbers = new Scanner(System.in);
        int num1, num2;
        System.out.println("Input first number");
        num1 = numbers.nextInt();
        System.out.println("Input operator");
        operator = operators.next();
        System.out.println("Input second number");
        num2 = numbers.nextInt();
        switch (operator) {
            case "+":
                System.out.printf("%d plus %d equals %d\n", num1, num2, (num1 + num2));
                break;
            case "-":
                System.out.printf("%d minus %d equals %d\n", num1, num2, (num1 - num2));
                break;
            default:
                System.out.println("Losing interest....");
        }
    }
}
