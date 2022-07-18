package classroom.polymorphism;

public class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public double getAmountAfterDiscount() {
        return (this.amount - (this.amount / 100 * this.customer.getDiscount()));
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id: " + id +
                ", customer " + customer +
                ", amount: " + amount +
                ", amount after discount: " + this.getAmountAfterDiscount() +
                '}';
    }
}
