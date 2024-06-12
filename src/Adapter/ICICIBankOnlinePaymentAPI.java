package Adapter;

public class ICICIBankOnlinePaymentAPI {

    public ICICIBankOnlinePaymentAPI() {
    }
    public String sendMoney(){
        System.out.println("Sending Money From ICICI Bank");
        return "20000";

    }
    public String verifyBalance(){
        System.out.println("Sending Money From ICICI Bank");
        return "3000";

    }
    public String whoamI(){
        return "Authenticating account Number and card Holder from ICICI Bank";
    }
}
