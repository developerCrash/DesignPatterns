package Observer;

public class PaymentSubscriber implements OrderPlacedSubscriber{

    public PaymentSubscriber() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData notifySubscriber() {
        ReturnData data = new ReturnData("");
        data.setData("Payment has been done");
        return data;
    }
}
