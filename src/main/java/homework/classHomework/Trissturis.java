package homework.classHomework;

public class Trissturis {
    int sideA;
    int sideB;
    int sideC;
    double area;

    public Trissturis() {
    }

    public Trissturis(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        this.area = 0.25 * Math.sqrt(4 * Math.pow(sideA, 2) * Math.pow(sideB, 2) - Math.pow((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)),2));
    }

    public double calculateAre(){
        return 0.25 * Math.sqrt(4 * Math.pow(sideA, 2) * Math.pow(sideB, 2) - Math.pow((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)),2));
    }

    public boolean isEquilateral(){
        return (sideA == sideB && sideB == sideC);
    }

    public boolean isIsosceles(){
        return (sideA == sideB || sideB == sideC || sideC == sideA);
    }
}


