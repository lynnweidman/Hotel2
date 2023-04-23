package model;

public abstract class Payment {
    private int paymentId;
    private int billId;

    public Payment(int paymentId, int billId) {
        this.paymentId = paymentId;
        this.billId = billId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", bill_Id=" + billId +
                '}';
    }
}
