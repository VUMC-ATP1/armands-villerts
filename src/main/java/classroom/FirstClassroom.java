package classroom;

import java.util.Arrays;

public class FirstClassroom {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Edit Configurations -> Program arguments
//        System.out.println("First argument " + args[0]);

        byte floorCount = 5;
        System.out.println("Floor count: " + floorCount);
        // %s - string, %d - numbers
        System.out.printf("Formatted floor count %d\n\n", floorCount);

        short salaryInEur;
        salaryInEur = 1000;
        System.out.println("Short: " + salaryInEur);

        int chinaPopulation = 1449687399;
        System.out.println("Chinese: " + chinaPopulation);

        long worldPopulation = 721315678;
        System.out.println("Too much: " + worldPopulation);

        float currentWeight = 93.69f;
        System.out.println("Some float: " + currentWeight);

        double someDoubleValue = 1.6753742d;
        System.out.println("Double value: " + someDoubleValue);

        boolean isTrue = false;
        System.out.println("Is it True? " + isTrue);
        System.out.printf("Formatted boolean %b\n", isTrue);
        if (isTrue) {
            System.out.println("This is TRUE");
        }
        else {
            System.out.println("This is FALSE");
        }

        char someLetter = '\u0174';
        System.out.println("Unicode char: " + someLetter);

        String firstNameLastName = "John Doe";
        System.out.println("First name and last name " + firstNameLastName);

//        operators
        System.out.println(2 + 2);
        System.out.println("2 + 2");
        System.out.println("2" + 2);

        int one = 2;
        int two = 2;
        int sum = one + two;
        System.out.println(sum);

        boolean isGreater = 20 > 10;
        System.out.println("Is greater: " + isGreater);

//        arrays
        short arrayOfShorts[] = new short[3];
        arrayOfShorts[0] = 100;
        arrayOfShorts[1] = 200;
        arrayOfShorts[2] = 300;
        System.out.println(arrayOfShorts.length);
        System.out.println(arrayOfShorts[0] + arrayOfShorts[2]);
    }
}