package Decorator;

public class ButterScotchScoop implements IceCream{
    public IceCream iceCream ;
    public ButterScotchScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + 20 ;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " ButterScotchScoop";
    }
}

