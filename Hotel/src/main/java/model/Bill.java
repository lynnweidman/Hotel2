package model;

public class Bill {
    private int billId;
    private int orderId;
    private double totalBill;

    public Bill(int billId, int orderId, double totalBill) {
        this.billId = billId;
        this.orderId = orderId;
        this.totalBill = totalBill;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", orderId=" + orderId +
                ", totalBill=" + totalBill +
                '}';
    }

}
