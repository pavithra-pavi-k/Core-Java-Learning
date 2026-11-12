package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        
        Bank b = new Bank();
        System.out.println(b.getbalance());

        b.withdraw(1000);
        System.out.println(b.getbalance());

        b.setdeposite(500);
        System.out.println(b.getbalance());
    }

}
