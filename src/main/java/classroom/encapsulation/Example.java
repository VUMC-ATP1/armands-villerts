package classroom.encapsulation;

public class Example {
    public static void main(String[] args) {
        Person unknown = new Person();
        unknown.age = 99;
        unknown.name = "John";
        unknown.lastName = "Doe";

        Student nobody = new Student();
        nobody.graduationYear = 1900;
        nobody.name = "Jane";
        System.out.println(nobody.isHasMood());
        nobody.setHasMood(true);
        System.out.println(nobody.isHasMood());
        System.out.println(nobody.toString());

        Student anotherStudent = new Student("testing");
        System.out.println(anotherStudent.getEmail());

        Student students1 = new Student("");
        System.out.println(students1.getEmail());
        students1.setEmail("something@testing.tst");
        System.out.println(students1.getEmail());

        Student students2 = new Student();
        students2.setGraduationYear(2030);
        students2.setGraduationYear(2020);
        System.out.println(students2.graduationYear);


    }
}
