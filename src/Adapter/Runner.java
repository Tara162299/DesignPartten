package Adapter;

import Adapter.New.NewCustomerInfo;
import Adapter.Old.CreditCard;
import Adapter.Old.Customer;
import Adapter.Old.CustomerInfo;

public class Runner {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("Tara", "1111111111111111", 8, 22, 999, 5000);
        CustomerInfo oldInfo = new Customer("Not Tara", 12345679, "82 Nguyen Tuan", card1);

        NewCustomerInfo test = new Adapter(oldInfo);
        testMethods(test);
    }

    public static void testMethods(NewCustomerInfo info) {
        System.out.println(info.getCustCardNo());
        System.out.println(info.getCardExpDate());
        System.out.println(info.getCardOwnerName());
        System.out.println(info.getAddress());
        System.out.println(info.getCVVNo());
        System.out.println(info.getTotalAmount());
    }
}
