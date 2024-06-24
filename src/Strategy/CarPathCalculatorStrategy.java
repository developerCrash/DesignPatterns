package Strategy;

public class CarPathCalculatorStrategy implements pathCalculatingStrategy{
    @Override
    public void pathCalculator(String src, String dest) {
        System.out.println("Going from " + src + " to " + dest + " through Car");

    }
    private CarPathCalculatorStrategy(){

    }
    private static CarPathCalculatorStrategy instance;

    public static CarPathCalculatorStrategy getInstance(){
        if (instance == null){
            instance = new CarPathCalculatorStrategy();
        }
        return instance;
    }
}
