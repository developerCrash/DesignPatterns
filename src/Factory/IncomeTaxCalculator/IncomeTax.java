package Factory.IncomeTaxCalculator;

public class IncomeTax {

    public static void main(String[] args){

        TaxCalculationFactory tcf = TaxCalculationFactoryFactory.createTaxCalculationFactory(TaxRegime.OLD);
        TaxCalculator tc = tcf.createTaxCalculator();
        System.out.println(tc.calculateTax());
    }


}
