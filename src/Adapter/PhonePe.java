package Adapter;

public class PhonePe {

    private static OnlinePaymentAPI opAPI= new ICICIBankAPIAdapter ();
    public PhonePe(){

    }

    public static void main(String[] args){
         System.out.println(opAPI.authenticate("Anil"));
         System.out.println(opAPI.checkBalance("Anil"));
         System.out.println(opAPI.transferMoney("Anil", "Kumar", 2000));
    }
}
