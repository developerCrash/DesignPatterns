package Observer;

public class Client {
    public static void main(String[] args) {
        EmailSubscriber emailSubscriber = new EmailSubscriber();
        PaymentSubscriber paymentSubscriber = new PaymentSubscriber();
        WhatsappSubscriber whatsappSubscriber = new WhatsappSubscriber();

        Amazon a = Amazon.getInstance();
        a.OrderPLaced();
        a.deRegisterSubscriber(whatsappSubscriber);
        a.OrderPLaced();
    }
}
