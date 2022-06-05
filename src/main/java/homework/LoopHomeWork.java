package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("---= Task 1 =---");
        int sumOfNumbers = 0;
        do {
            System.out.println("Please input number");
            int userNumber = userInput.nextInt();
            sumOfNumbers += userNumber;
            if (sumOfNumbers > 100) {
                System.out.println("Gatavs");
            }
        } while (sumOfNumbers <= 100);

        System.out.println("---= Task 2 =---");
        System.out.println("Please input number");
        boolean isPrime = false;
        int userPrime = userInput.nextInt();
        if (userPrime <= 1) {
            System.out.println("Not a prime number");
        } else {
            for (int i = 2; i < userPrime; i++) {
                isPrime = userPrime % i != 0;
                if (!isPrime) {
                    System.out.printf("Number %d is not prime\n", userPrime);
                    break;
                }
            }
            if (isPrime) System.out.printf("Number %d is prime\n", userPrime);
        }

        System.out.println("---= Task 3 =---");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        String[] strArr = {"one", "two", "three", "four", "five"};
        char[] chrArr = {'A', 'B', 'C', 'D'};
        int j = 0;
        while (j < intArr.length) {
            System.out.print(intArr[j] + " ");
            j++;
        }
        System.out.println();
        j = 0;
        do {
            System.out.print(intArr[j] + " ");
            j++;
        } while (j < intArr.length);
        System.out.println();
        for (j = 0; j < intArr.length; j++) {
            System.out.print(intArr[j] + " ");
        }
        System.out.println();
        for (int number : intArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        j = 0;
        while (j < strArr.length) {
            System.out.print(strArr[j] + " ");
            j++;
        }
        System.out.println();
        j = 0;
        do {
            System.out.print(strArr[j] + " ");
            j++;
        } while (j < strArr.length);
        System.out.println();
        for (j = 0; j < strArr.length; j++) {
            System.out.print(strArr[j] + " ");
        }
        System.out.println();
        for (String word : strArr) {
            System.out.print(word + " ");
        }
        System.out.println();
        j = 0;
        while (j < chrArr.length) {
            System.out.print(chrArr[j] + " ");
            j++;
        }
        System.out.println();
        j = 0;
        do {
            System.out.print(chrArr[j] + " ");
            j++;
        } while (j < chrArr.length);
        System.out.println();
        for (j = 0; j < chrArr.length; j++) {
            System.out.print(chrArr[j] + " ");
        }
        System.out.println();
        for (char character : chrArr) {
            System.out.print(character + " ");
        }
        System.out.println();

        System.out.println("---= Task 4 =---");
        int[] evenNumbers = new int[100];
        int k = 0, l = 0;
        while (l < evenNumbers.length) {
            if (k % 2 == 0) {
                evenNumbers[l] = k;
                k++;
                l++;
            } else {
                k++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));

        System.out.println("---= Task 5 =---");
        System.out.println("Please input number");
        int num = userInput.nextInt();
        int factorial = num;
        if (num < 0) {
            System.out.println("Only positive numbers allowed");
        } else if (num == 0) {
            System.out.println("0! = 1");
        } else {
            for (j = num - 1; j > 0; j--) {
                factorial = factorial * j;
            }
            System.out.println(num + "! = " + factorial);
        }

        System.out.println("---= Task 6 =---");
        final int pin = 1234;
        int i1 = 0;
        System.out.println("Input PIN");
        while (i1 < 3) {
            int userPin = userInput.nextInt();
            if (userPin == pin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (i1 < 2) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            }
            i1++;
            if (i1 == 3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
            }
        }
    }
}
