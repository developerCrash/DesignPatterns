package Factory.TaxCalculator;

import Factory.TaxCalculator.TaxCalculationTypes.CalculationType;
import Factory.TaxCalculator.TaxCalculationTypes.NewCalculationType;

public class NewTaxRegime implements TaxRegime{
    @Override
    public CalculationType calculateTax() {
        return new NewCalculationType();
    }
}
