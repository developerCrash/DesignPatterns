package Factory.TaxCalculator;

import Factory.TaxCalculator.TaxCalculationTypes.CalculationType;

public class Client {
    public static void main(String[] args) {
        User anil = new User("Anil", 35, 2000000, SupportedTaxRegimes.OLD);
        TaxRegime taxRegime = anil.calculateTax();
        CalculationType calculationType = taxRegime.calculateTax();
    }
}
