package Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    public List<OrderPlacedSubscriber> orderPlacedSubscriber ;

    private static Amazon instance ;

    private Amazon() {
        //this.orderPlacedSubscriber = orderPlacedSubscriber;
        this.orderPlacedSubscriber = new ArrayList<>();
    }
    public static Amazon getInstance(){
        if(instance == null){
            instance = new Amazon();
        }
        return instance;
    }
    public void OrderPLaced(){

        for(OrderPlacedSubscriber orderPlacedSubscriber1 : orderPlacedSubscriber){
            ReturnData data = orderPlacedSubscriber1.notifySubscriber();
            System.out.println(data.getData());
        }
    }
    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscriber.add(orderPlacedSubscriber);
    }
    public void deRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscriber.remove(orderPlacedSubscriber);
    }
}
