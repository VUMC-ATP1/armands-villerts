package classroom.chaining;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Vehicle {
    public String brand;
    public String color;
    public String engine;
    public int yearOfProduction;
    public double price;

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public Vehicle setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Vehicle setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public Vehicle setPrice(double price) {
        this.price = price;
        return this;
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void fillUp() {
        System.out.println("Filling up");
    }
}
