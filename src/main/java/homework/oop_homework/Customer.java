package homework.oop_homework;

public class Customer {
    String name;
    static String memberType;
    static boolean member = false;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public static String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        if (DiscountRate.discountNames.contains(memberType)) {
            this.memberType = memberType;
            this.member= true;
        } else {
            System.out.println("Not a valid membership type!");
            this.member= false;
        }
    }

    @Override
    public String toString() {
        if (isMember()) {
            return "Customer{" +
                    "name: '" + name + '\'' +
                    ", memberType: '" + memberType + '\'' +
                    ", member: " + member +
                    '}';
        } else {
            return "Customer{" +
                    "name: " + name + '\'' +
                    ", not a member" +
                    '}';
        }
    }
}
