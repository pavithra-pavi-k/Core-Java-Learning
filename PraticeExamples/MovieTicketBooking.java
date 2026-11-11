package PraticeExamples;


class MovieTicket{
    String movie_name;
    double ticketPrice;


    MovieTicket(String movie_name,double ticketPrice){
        this.movie_name = movie_name;
        this.ticketPrice = ticketPrice;
    }

    void bookicket(){
        System.out.println("Booking 1 ticket");
    }

    void bookticket(int qunatity){
        System.out.println("Booking "+qunatity+" tickets");
    }

    void bookticket(int qunatity,boolean snacks){
        System.out.println("Booking "+qunatity+" tickets");
        System.out.println("snacks included :"+snacks);

    }
       double CalculatePrice(){
        return ticketPrice;

}
}


//child class1
class RegularTicket extends MovieTicket{

    RegularTicket(String movie_name,double ticketPrice){
        super(movie_name,ticketPrice);
    }

    double CalculatePrice(){
        return ticketPrice;
    }
}

class Premiumticket extends MovieTicket{

    Premiumticket(String movie_name,double ticketPrice){
        super(movie_name,ticketPrice);
    }

    double CalculatePrice(){
        return ticketPrice;
    }

}
public class MovieTicketBooking {

    public static void main(String[] args) {
        
        RegularTicket r = new RegularTicket("Ramayana", 150);

        Premiumticket p = new Premiumticket("Ramayana", 250);


        System.out.println("Regular Ticket Booking :");
        r.bookicket();
        r.bookticket(2);
        System.out.println("Premium Ticket Booking : ");
        p.bookticket(2, true);

        System.out.println("Regular Ticket price is:"+r.CalculatePrice());
        System.out.println("Premium Ticket Price is : "+p.CalculatePrice());


    }

}
