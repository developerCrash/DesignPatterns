package Decorator;

public class Cone implements IceCream{

    public IceCream iceCream ;
    public Cone(){}

    public Cone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        if (iceCream == null){
            return 10;
        }
        else {
            return iceCream.getCost() + 10 ;
        }
    }

    @Override
    public String getDesc() {
        if (iceCream == null){
            return "Cone";
        }
        else {
            return iceCream.getDesc() + "Cone";
        }
    }
}
