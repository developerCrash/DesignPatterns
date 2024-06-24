package Strategy;

class BikePathCalculatorStrategy implements pathCalculatingStrategy{
    @Override
    public void pathCalculator(String src, String dest) {
        System.out.println("Going from " + src + " to " + dest + " through Bike");
    }
    private static BikePathCalculatorStrategy instance ;

    private BikePathCalculatorStrategy(){

    }
    public static BikePathCalculatorStrategy getInstance() {
        if (instance == null){
            instance = new BikePathCalculatorStrategy();
        }
        return instance;
    }
}
