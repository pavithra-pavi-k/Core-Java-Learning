package OOPS.inheritanse;


class User{
    int userid =1;
    String name = "pavi";
    String emial = "pavi@123gmail.com";

    void displayUserDetailes(){
        System.out.println("User id : "+userid);
        System.out.println("Name : "+name);
        System.out.println("Email : "+emial);
    }

}

class Order extends User{
    int orderid = 101;
    String productname = "mouse";
    int quantity = 1;
    float price = 500;

    void CalculateTotalAMount(){
        System.out.println("Total Amount :"+(quantity*price));
    }

    void displayOrderDetalis(){
        System.out.println("Order id :"+orderid);
        System.out.println("Product name  : "+productname);
    }
}

class Payment extends Order{
    String paymentmode = "online";
    int Transcationid = 890876001;

    void makepayment(){
        System.out.println("Payment confirmed");
    }

    void displayPaymentDetalis(){
        System.out.println("Payment mode : "+paymentmode);
        System.out.println("Transcation id : "+Transcationid);

    }
}
public class ExampleMultilevelinheritance {

    public static void main(String[] args) {
        
        Payment p = new Payment();
        
        //user class
        p.displayUserDetailes();

        //order class
        p.CalculateTotalAMount();
        p.displayOrderDetalis();

        //payment class

        p.makepayment();
        p.displayPaymentDetalis();
    }
}
