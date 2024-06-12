package Adapter;

public class ICICIBankAPIAdapter implements OnlinePaymentAPI{

    ICICIBankOnlinePaymentAPI iciciBankOnlinePaymentAPI ;

    public ICICIBankAPIAdapter() {
        this.iciciBankOnlinePaymentAPI = new ICICIBankOnlinePaymentAPI();
    }

    @Override
    public double checkBalance(String userID) {
        System.out.println("We are Checking Balance of  " + userID);
        String icici_checkbalance = this.iciciBankOnlinePaymentAPI.verifyBalance();
        double d = Double.parseDouble(icici_checkbalance);
        return d;
    }

    @Override
    public String transferMoney(String fromUser, String toUser, double amount) {
        System.out.println("We are trying to transfer Money from " + fromUser + " to " + toUser);
        String icici_transferMoney = this.iciciBankOnlinePaymentAPI.sendMoney();
        return icici_transferMoney ;
    }

    @Override
    public boolean authenticate(String userId) {
        System.out.println("Hold on, We are trying to authenticate " + userId);
        String icici_authenticate = this.iciciBankOnlinePaymentAPI.whoamI();
        if(icici_authenticate == "Authenticating account Number and card Holder from ICICI Bank"){
            return true;
        }
        else {
            return false;
        }
    }
}
