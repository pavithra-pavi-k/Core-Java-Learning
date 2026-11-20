package threads.BankSystem;

import threads.BankSystem.bank;;

public class ATM  extends Thread{
    
    bank bank;
    String op;
    int amount;
    ATM(bank bank,String op,int amount){
        this.bank=bank;
        this.op=op;
        this.amount=amount;
    }

    public void disp(){
        if(op=="withdraw"){
            try{
                bank.withdraw(amount);
                bank.getBal();
            
            }
            catch(BankException e){
                System.out.println(e.getMessage());
            }
        }
        else if(op=="deposite"){
            bank.deposite(amount);
            bank.getBal();
            
        }
        else if(op=="balance"){
            bank.getBal();
        }
        else{
            System.out.println("wrong option");
        }
    }

    public void run(){
        disp();
    }

}

