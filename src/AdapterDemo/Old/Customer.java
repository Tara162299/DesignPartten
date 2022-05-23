package AdapterDemo.Old;

public class Customer implements customerInfo{
    private String name;
    private int SSN;
    private String address;

    private CreditCard customerCard;

    public Customer(String name, int SSN, String address, CreditCard customerCard) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.customerCard = customerCard;
    }

    public CreditCard getCustomerCard() {
        return customerCard;
    }

    public void setCustomerCard(CreditCard customerCard) {
        this.customerCard = customerCard;
    }

    public String getCustomerName() {
        return name;
    }

    @Override
    public int getSSN() {
        return SSN;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getCustomerCardName() {
        return customerCard.getCustomerName();
    }

    @Override
    public String getCustomerCardNumber() {
        return customerCard.getCardNumber();
    }

    @Override
    public int getCustomerCardCVV() {
        return customerCard.getCVV();
    }

    @Override
    public int getMonthExpire() {
        return customerCard.getMonthExpire();
    }

    @Override
    public int getYearExpire() {
        return customerCard.getYearExpire();
    }

    @Override
    public double getAmount() {
        return customerCard.getAmount();
    }

}

/*
public String getDateExpire() {
        if (monthExpire < 10) {
            return "0" + monthExpire + "/" + yearExpire;
        }
        return monthExpire + "/" + yearExpire;
    }
 */
