package Strategy;

public class Maps {

    public Maps(){}
    public void calculateMap(String src, String dest, TravelMode mode){
        pathCalculatingStrategy p = PathCalculatorFactory.CalculatePath(mode);
        p.pathCalculator(src, dest);
    }
}
