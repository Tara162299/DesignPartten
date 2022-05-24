package Adapter.New;

public interface NewCustomerInfo {
    String getCustCardNo();
    String getCardOwnerName();
    String getCardExpDate();
    Integer getCVVNo();
    Double getTotalAmount();

    String getAddress();
    void setCustCardNo(String custCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpDate(String cardExpDate);
    void setCVVNo(Integer cVVNo);
    void setTotalAmount(Double totalAmount);
}
