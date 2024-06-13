package Decorator;

public class VanillaScoop implements IceCream{
    public IceCream iceCream ;
    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + 50 ;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " VanillaScoop";
    }
}
