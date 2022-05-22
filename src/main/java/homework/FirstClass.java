package homework;

public class FirstClass {
    public static void main(String[] args) {
    String countryName = "Grand Duchy of Luxembourg";
    int countryPopulation = 645397;
    int countryArea = 2586;
    String countryCapital = "Luxembourg";
    String countryLanguage = "Luxembourgish";
    boolean isEU = true;
    char countryCurrency = '€';

        System.out.println("Country:    " + countryName);
        System.out.println("Population: " + countryPopulation);
        System.out.println("Area:       " + countryArea + " km²");
        System.out.println("Capital:    " + countryCapital);
        System.out.println("Language:   " + countryLanguage);
        System.out.println("EU member:  " + isEU);
        System.out.println("Currency:   " + countryCurrency);
        System.out.printf("----- \n\n");

    int established = 963;
    String historyPart2 = " when count Siegfried acquired a rocky promontory and its Roman-era fortifications, known as Lucilinburhuc.";

        System.out.printf("The history of Luxembourg is considered to begin in %d %s\n", established, historyPart2);
        System.out.printf("----- \n\n");

    int a = 5;
    int b = 4;
    int c = 25;
    int d = 100;

        System.out.printf("a = %d\nb = %d\nc = %d\nd = %d\n", a, b, c, d);
        System.out.printf("a + b = %d\n", a + b);
        System.out.printf("b + b + c = %d\n", b + b + c);
        System.out.printf("c + d = %d\n", c + d);
        System.out.printf("c - b = %d\n", c - b);
        System.out.printf("a - d = %d\n", a - d);
        System.out.printf("d - c - b - a = %d\n", d - c - b - a);
        System.out.printf("a x b = %d\n", a * b);
        System.out.printf("b x c = %d\n", b * c);
        System.out.printf("d x a = %d\n", d * a);
        System.out.printf("c ÷ a = %d\n", c / a);
        System.out.printf("d ÷ c = %d\n", d / c);
        System.out.printf("d ÷ b ÷ a = %d\n", d / b / a);
    }
}
