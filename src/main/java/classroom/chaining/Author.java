package classroom.chaining;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author {" +
                "name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                '}';
    }

}
