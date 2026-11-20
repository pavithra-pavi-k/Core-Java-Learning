package threads.bank;

public class bank {

    private int balance=1000;

    public void withdraw(int amount){
        if(amount<=balance){
            System.out.println(amount+ " withdraw");
            balance-=amount;
        }
        else{
            System.out.println("insuffient amount");
        }
    }

    public void deposite(int amount){
        System.out.println(amount+ " credited");
        balance+=balance;
    }

    public void getBal(){
        System.out.println("bal = "+balance);
    }
}
