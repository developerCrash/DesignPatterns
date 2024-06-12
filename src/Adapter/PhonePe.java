package Adapter;

public class PhonePe {

    private OnlinePaymentAPI onlinePaymentAPI ;

    public PhonePe() {
        this.onlinePaymentAPI = new YESBankAPIAdapter();
    }


}
