package Strategy;

public class PathCalculatorFactory {
    public static pathCalculatingStrategy CalculatePath(TravelMode mode){
        return switch (mode){
            case CAR -> CarPathCalculatorStrategy.getInstance();
            case WALK -> WalkPathCalculatorStrategy.getInstance();
            case BIKE -> BikePathCalculatorStrategy.getInstance();
        };
    }
}
