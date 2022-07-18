package classroom;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

            System.out.printf("a equals b: %b\n", a == b);
            System.out.printf("a not equals b: %b\n", a != b);

        int c = 99;
        int d = 100;

            System.out.printf("c greater than d: %b\n", c > d);
            System.out.printf("c less than d: %b\n", c < d);

        String text1 = "Whatever";
        String text2 = new String ("Whatever");

            System.out.printf("Comparing objects: %b\n", text1 == text2);
            System.out.printf("Comparing strings: %b\n", text1.equals(text2));

        int x = 7;
        boolean result = x < 5 && x < 15;
            System.out.printf("Less than 5 AND less than 15: %b\n", result);
            System.out.printf("Less than 5 OR less than 15: %b\n", result);
        result = !(x < 15);
            System.out.printf("Not less than 15: %b\n", result);
    }
}
