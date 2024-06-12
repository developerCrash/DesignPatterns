package Adapter;

public class YESBankAPIAdapter implements OnlinePaymentAPI{

    private YESBankOnlinePaymentAPI yesBankOnlinePaymentAPI ;

    public YESBankAPIAdapter() {
        this.yesBankOnlinePaymentAPI = new YESBankOnlinePaymentAPI();
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
