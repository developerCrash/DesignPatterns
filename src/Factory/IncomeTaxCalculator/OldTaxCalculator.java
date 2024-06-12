package Factory.IncomeTaxCalculator;

public class OldTaxCalculator implements TaxCalculator{
    @Override
    public Double calculateTax() {
        System.out.println("This is old method of calculating tax");
        return 300000.0;
    }
}
