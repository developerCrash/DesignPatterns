package Decorator;

public class OrangeScoop implements IceCream{
    public IceCream iceCream ;
    public OrangeScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + 50 ;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " OrangeScoop";
    }
}
