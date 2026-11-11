package Game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        
        System.out.println("Please enter the below option");
        System.out.println(" 0.for Rock\n 1.for Paper\n 2.for scissor\n");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random = new Random();
        int sysInput = random.nextInt(3);


        if(userInput == sysInput){
            System.out.println("Draw");
        }

        else if ((userInput==0 && sysInput==2)||(userInput==1 && sysInput==0)||(userInput==2 && sysInput==1)){
            System.out.println("you win!!");
        }

        else{
            System.out.println("you lose!!");
        }


        System.out.println("UserInput =  "+userInput);
        System.out.println("SysInput = "+sysInput);
    }

}
