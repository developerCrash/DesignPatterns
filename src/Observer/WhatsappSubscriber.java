package Observer;

public class WhatsappSubscriber implements OrderPlacedSubscriber{

    public WhatsappSubscriber() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData notifySubscriber() {
        ReturnData data = new ReturnData("");
        data.setData("Notified the customer through whats app");
        return data;
    }
}
