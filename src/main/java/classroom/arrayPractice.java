package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class arrayPractice {
    public static void main(String[] args) {
        int[] dayOfTheWeek = {1,2,3,4,5,6,7};
        System.out.println(dayOfTheWeek.length);
        System.out.println(dayOfTheWeek[2]);
        System.out.println(dayOfTheWeek[dayOfTheWeek.length - 1]);

        String[] dayNames = new String[7];
        dayNames[0] = "Monday";
        dayNames[1] = "Tuesday";
        dayNames[2] = "Wednesday";
        dayNames[3] = "Thursday";
        dayNames[4] = "Friday";
        dayNames[5] = "Saturday";
        dayNames[6] = "Sunday";
        System.out.println(dayNames[2]);
        dayNames[2] = "Little Friday";
        System.out.println(dayNames[2]);

        Random randomValue = new Random();
        int[] randomNumber = {randomValue.nextInt(10,20), randomValue.nextInt(20,30), randomValue.nextInt(30,40)};
        System.out.println(randomNumber[0]);
        System.out.println(randomNumber[1]);
        System.out.println(randomNumber[2]);
        System.out.println(Arrays.toString(randomNumber));

        List<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("Apple");
        listOfFruits.add("Banana");
        listOfFruits.add("Cherry");
        System.out.println(listOfFruits.get(1));


    }
}
