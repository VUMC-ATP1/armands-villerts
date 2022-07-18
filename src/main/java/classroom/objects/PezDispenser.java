package classroom.objects;

public class PezDispenser {
    int maxCandyCount = 10;
    int remainingCandyCount;
    String name;

    public PezDispenser(String name) {
        this.name = name;
        this.remainingCandyCount = maxCandyCount;

        System.out.println("Current candy count: " + this.remainingCandyCount);
    }

    public int eatOne() {
        if (remainingCandyCount > 0) {
            remainingCandyCount--;
        } else {
            System.out.println("Pez dispenser is empty");
        }
        return remainingCandyCount;
    }

    public int eatSome(int candyCount) {
        if (remainingCandyCount - candyCount >= 0) {
            remainingCandyCount = remainingCandyCount - candyCount;
        } else {
            System.out.println("Not that much left you greedy bastard!");
        }
        return remainingCandyCount;
    }

    public int fillUpFull() {
        if (remainingCandyCount < maxCandyCount) {
            do {
                fillUp(1);
            } while (remainingCandyCount < maxCandyCount);
        } else {
            System.out.println("Dispenser is already full");
        }
        return remainingCandyCount;
    }

    public int fillUp(int candyAmount) {
        if (this.remainingCandyCount + candyAmount <= this.maxCandyCount) {
            this.remainingCandyCount = this.remainingCandyCount + candyAmount;
        } else {
            System.out.println("Dispenser is already full");
        }
        return this.remainingCandyCount;
    }
}
