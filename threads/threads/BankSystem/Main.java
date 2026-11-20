package threads.BankSystem;

import OOPS.Encapsulation.Bank;

public class Main {

      public static void main(String[] args)throws Exception {
        bank bank=new bank();
       PhonePay pay = new PhonePay(bank, "deposite", 500);
        //pay.disp();

        ATM atm = new ATM(bank, "withdraw", 5000);
       // pay.disp();

       PhonePay pay2 = new PhonePay(bank, "deposite", 500);


    pay.join(100);
    pay.start();

    pay2.join(100);
    pay2.start();

    atm.join(100);
    atm.start();
   

    }

}
