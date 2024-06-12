package Adapter;

public class ICICIBankAPIAdapter implements OnlinePaymentAPI{

    ICICIBankOnlinePaymentAPI iciciBankOnlinePaymentAPI ;

    public ICICIBankAPIAdapter(ICICIBankOnlinePaymentAPI iciciBankOnlinePaymentAPI) {
        this.iciciBankOnlinePaymentAPI = new ICICIBankOnlinePaymentAPI();
    }

    @Override
    public double checkBalance(String userID) {
        return 0;
    }

    @Override
    public String transferMoney(String fromUser, String toUser, double amount) {
        return "";
    }

    @Override
    public boolean authenticate(String userId) {
        return false;
    }
}
