package Adapter;

public class YESBankAPIAdapter implements OnlinePaymentAPI{

    private YESBankOnlinePaymentAPI yesBankOnlinePaymentAPI ;

    public YESBankAPIAdapter() {
        this.yesBankOnlinePaymentAPI = new YESBankOnlinePaymentAPI();
    }

    @Override
    public double checkBalance(String userID) {
        System.out.println("We are Checking Balance of  " + userID);
        String icici_checkbalance = this.yesBankOnlinePaymentAPI.verifyBalance();
        double d = Double.parseDouble(icici_checkbalance);
        return d;
    }

    @Override
    public String transferMoney(String fromUser, String toUser, double amount) {
        System.out.println("We are trying to transfer Money from " + fromUser + " to " + toUser);
        String icici_transferMoney = this.yesBankOnlinePaymentAPI.sendMoney();
        return icici_transferMoney ;
    }

    @Override
    public boolean authenticate(String userId) {
        System.out.println("Hold on, We are trying to authenticate " + userId);
        String icici_authenticate = this.yesBankOnlinePaymentAPI.whoamI();
        if (icici_authenticate == "Logging in the YES Bank User Profile and Authenticating") {
            return true;
        } else {
            return false;
        }
    }
}
