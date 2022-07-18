package classroom.encapsulation;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
public class Student extends Person {
    private final String mailDomain = "@lu.lv";
    public int graduationYear;
    @Getter
    private String email;

    public Student() {
    }

    public Student(String accountName) {
        this.email = accountName + mailDomain;
    }

    public void setEmail(String email) {
        if (this.email.equals(this.mailDomain)) {
            this.email = email;
        } else {
            System.out.println("Not allowed!");
        }
    }

    public void setGraduationYear(int graduationYear) {
        if (graduationYear < LocalDate.now().getYear()) {
            this.graduationYear = graduationYear;
        } else {
            System.out.println("Not allowed");
        }
    }
}
