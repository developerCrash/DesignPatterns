package Adapter;

public interface OnlinePaymentAPI {

    double checkBalance(String userID);
    String transferMoney(String fromUser, String toUser, double amount);
    boolean authenticate(String userId);
}
