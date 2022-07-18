package classroom.objects;

public class Dog extends Animal {
    String breed;
    String dogsName;

    @Override
    public void Voice() {
        System.out.println(this.animalName + "says woof");
    }
}
