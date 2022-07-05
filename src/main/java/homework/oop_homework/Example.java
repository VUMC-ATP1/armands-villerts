package homework.oop_homework;

public class Example {
    public static void main(String[] args) {
        Customer a1 = new Customer("John Doe");
        System.out.println(a1.toString());
        a1.setMemberType("Gold");
        System.out.println(a1.toString());

        Visit visit1 = new Visit(a1, "20220701");
        visit1.setServiceExpense(120);
        visit1.setProductExpense(230);
        System.out.println(visit1.toString());

        Customer a2 = new Customer("Jane Doe");
        a2.setMemberType("Economy");
        System.out.println(a2.toString());

        Visit visit2 = new Visit(a2, "20220601");
        visit2.setServiceExpense(340);
        visit2.setProductExpense(450);
        System.out.println(visit2.toString());

    }
}
