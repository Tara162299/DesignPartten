package Adapter.Old;

public class CreditCard {
    private final String customerName;
    private final String cardNumber;
    private final int monthExpire;
    private final int yearExpire;
    private final int CVV;
    private double amount;

    private Customer customer;

    public CreditCard(String customerName, String cardNumber, int monthExpire, int yearExpire, int CVV, double amount) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        this.monthExpire = monthExpire;
        this.yearExpire = yearExpire;
        this.CVV = CVV;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getMonthExpire() {
        return monthExpire;
    }

    public int getYearExpire() {
        return yearExpire;
    }

    public int getCVV() {
        return CVV;
    }

    public double getAmount() {
        return amount;
    }
}
