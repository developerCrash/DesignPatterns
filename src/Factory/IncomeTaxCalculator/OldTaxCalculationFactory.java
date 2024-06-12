package Factory.IncomeTaxCalculator;

public class OldTaxCalculationFactory implements TaxCalculationFactory{
    @Override
    public TaxCalculator createTaxCalculator() {
        return new OldTaxCalculator();
    }
}
