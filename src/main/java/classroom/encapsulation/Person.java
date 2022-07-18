package classroom.encapsulation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Person {
    @Getter
    @Setter
    protected String name = "John";
    public String lastName = "Doe";
    private boolean hasMood;
    int age;

    public String getLastName() {
        return lastName;
    }

    public boolean isHasMood() {
        return hasMood;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHasMood(boolean hasMood) {
        this.hasMood = hasMood;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
