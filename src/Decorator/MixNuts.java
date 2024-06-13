package Decorator;

public class MixNuts implements IceCream{
    public IceCream iceCream ;
    public MixNuts(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + 40 ;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " MixNuts";
    }
}
