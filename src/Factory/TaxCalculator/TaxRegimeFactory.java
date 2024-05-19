package Factory.TaxCalculator;

public class TaxRegimeFactory {

    public static TaxRegime calculateTax(SupportedTaxRegimes supportedTaxRegime){
        return switch (supportedTaxRegime){
            case NEW -> new NewTaxRegime();
            case OLD -> new OldTaxRegime();
        };
    }
}
