package Strategy;

import java.util.Map;

public class Client {
    public static void main(String[] args){
        Maps m = new Maps();
        m.calculateMap("Delhi", "Agra", TravelMode.CAR);
    }
}
