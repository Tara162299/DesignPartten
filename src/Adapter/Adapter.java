package Adapter;

import Adapter.New.NewCustomerInfo;
import Adapter.Old.CustomerInfo;

public class Adapter implements NewCustomerInfo {

    private String cardNumber;
    private String cardName;
    private String cardDate;
    private int CVV;
    private double totalAmount;

    private final CustomerInfo info;

    public Adapter(CustomerInfo info) {
        this.info = info;
        transfer();
    }

    @Override
    public String getCustCardNo() {
        return cardNumber;
    }

    @Override
    public String getCardOwnerName() {
        return cardName;
    }

    @Override
    public String getCardExpDate() {
        return cardDate;
    }

    @Override
    public Integer getCVVNo() {
        return CVV;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String getAddress() {
        return info.getAddress();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.cardNumber = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardName = cardOwnerName;
    }

    @Override
    public void setCardExpDate(String cardExpDate) {
        this.cardDate = cardExpDate;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.CVV = cVVNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void transfer() {
        setCustCardNo(info.getCustomerCardNumber());
        setCardOwnerName((info.getCustomerCardName()));
        setCardExpDate(info.getMonthExpire() + "/" + info.getYearExpire());
        setCVVNo(info.getCustomerCardCVV());
        setTotalAmount(info.getAmount());
    }
}
