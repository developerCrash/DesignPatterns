package Factory.TaxCalculator;

public class User {
    private String name;
    private int age;
    private double salary ;
    private SupportedTaxRegimes taxRegimes;

    public User(String name, int age, double salary, SupportedTaxRegimes taxRegimes) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.taxRegimes = taxRegimes;
    }

    public TaxRegime calculateTax(){

        return TaxRegimeFactory.calculateTax(this.taxRegimes);
    }
}
