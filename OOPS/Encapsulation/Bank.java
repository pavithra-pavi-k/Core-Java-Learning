package OOPS.Encapsulation;

public class Bank {

    private int  balance = 2000;
    

    public int  getbalance(){
        return balance;
        
    }


    void withdraw(int amount){
        System.out.println(amount + " amount withdraw successfully");
        balance = balance -amount;
    }

    void setdeposite(int amount){
        System.out.println(amount + "amount credited");
        balance = balance +amount;
    }

}
