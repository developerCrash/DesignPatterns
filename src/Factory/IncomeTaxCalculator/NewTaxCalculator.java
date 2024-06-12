package Factory.IncomeTaxCalculator;

public class NewTaxCalculator implements TaxCalculator {
    @Override
    public Double calculateTax() {
        System.out.println("This is new method of calculating tax");
        return 20000.0;
    }
}
