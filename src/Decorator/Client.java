package Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new MixNuts(new OrangeScoop(new ButterScotchScoop(new ChocoChip(new Cone()))));

        System.out.println("Cost of Icecream is " + iceCream.getCost());
        System.out.println("Description of Icecream is " + iceCream.getDesc());
    }
}