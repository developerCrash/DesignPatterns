package Factory.TaxCalculator;

import Factory.TaxCalculator.TaxCalculationTypes.CalculationType;
import Factory.TaxCalculator.TaxCalculationTypes.OldCalclationType;

public class OldTaxRegime implements TaxRegime{
    @Override
    public CalculationType calculateTax() {
        return new OldCalclationType();
    }
}
