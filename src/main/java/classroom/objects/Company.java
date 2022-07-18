package classroom.objects;

public class Company {
    String companyName;
    String industry;
    int employees;
    double yearlyTurnaround;
    boolean isVatLiable;

    public Company() {
    }

    public Company(String companyName, String industry, int employees, double yearlyTurnaround, boolean isVatLiable) {
        this.companyName = companyName;
        this.industry = industry;
        this.employees = employees;
        this.yearlyTurnaround = yearlyTurnaround;
        this.isVatLiable = isVatLiable;
    }
}
