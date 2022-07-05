package homework.oop_homework;

import java.time.LocalDate;
import static java.time.format.DateTimeFormatter.BASIC_ISO_DATE;

public class Visit {
    Customer customer;
    LocalDate date;
    double serviceExpense;
    double productExpense;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = LocalDate.parse(date, BASIC_ISO_DATE);
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        if (Customer.isMember()) {
            return getProductExpense() - (getProductExpense() * DiscountRate.getProductDiscount(Customer.getMemberType())) +
                   getServiceExpense() - (getServiceExpense() * DiscountRate.getServiceDiscount(Customer.getMemberType()));
        } else {
            return this.productExpense + this.serviceExpense;
        }
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer " + customer +
                ", date: " + date +
                ", serviceExpense: " + serviceExpense +
                ", productExpense: " + productExpense +
                ", totalExpense: " + getTotalExpense() +
                '}';
    }
}
