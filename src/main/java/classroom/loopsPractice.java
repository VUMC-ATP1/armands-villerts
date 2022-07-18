package classroom;

import java.util.*;

public class loopsPractice {
    public static void main(String[] args) {
//        int i1 = 0;
//        while (i1 < 5) {
//            System.out.println(i1);
//            i1++;
//        }
//
//        int i2 = 10;
//        while (i2 > 0) {
//            System.out.println(i2);
//            i2--;
//        }
//
//        int[] listOfValues1 = {1,3,8,4,9,15};
//        int i3 = 0;
//        while (i3 < listOfValues1.length) {
//            System.out.println(listOfValues1[i3]);
//            i3++;
//        }
        // lazy solution
//        int i4 = 0;
//        while (i4 <= 10) {
//            System.out.println(i4);
//            i4 = i4 + 2;
//        }

//        int i4 = 0;
//        while (i4 <= 10) {
//            if(i4 % 2 ==0) {
//                System.out.println(i4);
//            }
//            i4++;
//        }

//        int i5 = 0;
//        do {
//            System.out.println(i5);
//            i5++;
//        } while (i5 <= 5);

//        int i6 = 0;
//        do {
//            if (i6 % 2 != 0) {
//                System.out.println(i6);
//            }
//            i6++;
//        } while ( i6 <= 10);

//        String[] countries = new String[]{"LV","US","CZ","PL"};
//        int i7 = 0;
//        do {
//            if(countries[i7].equals("LV")) {
//                System.out.println("Latvia");
//            } else if (countries[i7].equals("CZ")) {
//                System.out.println("Czech");
//            } else {
//                System.out.println(countries[i7]);
//            }
//            i7++;
//        } while (i7 < countries.length);10

//        String[] countries = new String[]{"LV","US","CZ","PL"};
//        System.out.print(String.join(",",countries));
//        for (int i8 = 0; i8 < countries.length; i8++) {
//            System.out.println(countries[i8]);
//        }

//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i <= 100; i++) {
//            numbers.add(i);
//        }
//        System.out.println("Print with FOR");
//        for (int j = 0; j < numbers.size(); j++) {
//            if (numbers.get(j) % 2 == 0) {
//                System.out.println(numbers.get(j));
//            }
//        }
//        System.out.println("Print with FOR EACH");
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        List<Integer> houseNumbers = new ArrayList<>();
//        for (int i9 = 1; i9 <= 50; i9++) {
//            if (i9 % 3 != 0 && i9 % 5 != 0) {
//                houseNumbers.add(i9);
//                System.out.println(i9);
//            }
//        }
//        System.out.println(houseNumbers.size());

//        String sentence = "Hello, my name is Armands";
//        int charCount = 0;
//        for (int i = 0; i < sentence.length(); i++) {
//            if(sentence.charAt(i) == 'a') {
//                charCount++;
//            }
//        }
//        System.out.println(charCount);

        String[] countries = new String[]{"LV","US","CZ","PL","GB","ES","UA","LV","PT","US"};
        for (String country : countries) {
            if(country.equalsIgnoreCase("US")){
                System.out.println(country);
                break;
            }
        }

        for (int i = 0; i <= 10 ; i++) {
            if(i > 4 && i < 9){
                continue;
            }
            System.out.println(i);
        }
    }
}
