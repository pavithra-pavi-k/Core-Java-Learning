package threads.bank;

import OOPS.Encapsulation.Bank;

public class PhonePay  extends Thread{

    Bank bank;
    String op;
    int amount;
    PhonePay(Bank bank,String op,int amount){
        this.bank=bank;
        this.op=op;
        this.amount=amount;
    }

    public void disp(){
        if(op=="withdraw"){
            bank.withdraw(amount);
        }
        else if(op=="deposite"){
            bank.deposite(amount);
        }
        else if(op=="balance"){
            bank.getBal();
        }
        else{
            System.out.println("wrong option");
        }
    }

}
    
