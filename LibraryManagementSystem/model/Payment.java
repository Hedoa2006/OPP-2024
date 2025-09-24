package model;

abstract public class Payment extends Fine {
    public Payment(String id, String return_id, String reason, int money) {
        super(id, return_id, reason, money);
    }

    public abstract void processFinePayment();
    public abstract void viewPaymentHistory();
    public abstract void calculateTotalFine();
    public abstract int getPaymentCount();
}
