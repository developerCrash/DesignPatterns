package Decorator;

public class ChocoChip implements IceCream{
    public IceCream iceCream ;
    public ChocoChip(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + 30 ;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " ChocoChip";
    }
}
