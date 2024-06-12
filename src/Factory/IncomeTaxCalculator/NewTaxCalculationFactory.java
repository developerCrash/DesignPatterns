package Factory.IncomeTaxCalculator;

public class NewTaxCalculationFactory implements TaxCalculationFactory{
    @Override
    public TaxCalculator createTaxCalculator() {
        return new NewTaxCalculator();
    }
}
