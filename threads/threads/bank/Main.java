package threads.bank;

import OOPS.Encapsulation.Bank;

public class Main {

      public static void main(String[] args) {
        Bank bank=new Bank();
        PhonePay pay=new PhonePay(bank,"deposite",500);
        pay.disp();
    }

}
