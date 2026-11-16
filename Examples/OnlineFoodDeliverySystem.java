package Examples;

import javax.sound.sampled.SourceDataLine;

class Food{
    String foodname;
    double price;

    Food(String foodname,double price){

    this.foodname  = foodname;
    this.price = price;
    }

    public String getfoodname(){
        return foodname;
    }

    public double getprice(){
        return price;
    }

    void displayfood(){
        System.out.println("Food Name : "+foodname);
        System.out.println("Original Price : "+price);
    }
}

class Pizza extends Food{
    String size;
    double finalprice;

    Pizza(String foodname,double price,String size){

        super(foodname,price);

        this.size = size;

    }
    
    void CalculatePrice(){
        if(size.equals("large")){
            finalprice = price+150;
        }
        else if (size.equals("Medium")){
            finalprice  = price + 100;

        }
        else if(size.equals("Small")){
            finalprice = price + 0;
        }
    }

    void displaypizzadetails(){
       System.out.println("Pizza size : "+size);
       System.out.println("Final Price : "+finalprice); 
    }
    
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        
    
    Pizza p = new Pizza("Pizza",100,"Medium");
    p.displayfood();
    p.CalculatePrice();
    p.displaypizzadetails();


    }

}
