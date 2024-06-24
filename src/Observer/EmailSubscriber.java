package Observer;

public class EmailSubscriber implements OrderPlacedSubscriber{

    public EmailSubscriber() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData notifySubscriber() {

        ReturnData data = new ReturnData("");
        data.setData("Email has been Sent to the Customer");
        //System.out.println("Email has been sent to the customer");
        return data;
    }
}
