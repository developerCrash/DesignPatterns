package Factory.IncomeTaxCalculator;

public class TaxCalculationFactoryFactory {
    public static TaxCalculationFactory createTaxCalculationFactory(TaxRegime tr){
        return switch(tr){
            case NEW -> new NewTaxCalculationFactory();
            case OLD -> new OldTaxCalculationFactory();
        };
    }
}
