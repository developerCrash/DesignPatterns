package Factory.TaxCalculator;

import Factory.TaxCalculator.TaxCalculationTypes.CalculationType;

public interface TaxRegime {
    CalculationType calculateTax();
}
