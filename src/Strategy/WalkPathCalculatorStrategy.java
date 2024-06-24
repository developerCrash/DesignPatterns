package Strategy;

public class WalkPathCalculatorStrategy implements pathCalculatingStrategy{
    @Override
    public void pathCalculator(String src, String dest) {
        System.out.println("Going from " + src + " to " + dest + " through Walk");

    }
    private WalkPathCalculatorStrategy(){

    }
    private static WalkPathCalculatorStrategy instance ;

    public static WalkPathCalculatorStrategy getInstance() {
        if (instance == null){
            instance = new WalkPathCalculatorStrategy();
        }
        return instance;
    }
}
