package classroom.objects;

public class Car {
    public String brand;
    public String bodyType;
    public double engineDisplacement;
    public int wheelSize;
    public int seatCount;
    public boolean is4WheelDrive;

    public Car(String brand, String bodyType, double engineDisplacement, int wheelSize, int seatCount, boolean is4WheelDrive) {
        this.brand = brand;
        this.bodyType = bodyType;
        this.engineDisplacement = engineDisplacement;
        this.wheelSize = wheelSize;
        this.seatCount = seatCount;
        this.is4WheelDrive = is4WheelDrive;
    }

    public Car()
    {}
}
