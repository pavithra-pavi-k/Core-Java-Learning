package Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Randome Number Game ");
        Random random = new Random();
        int sysInput = random.nextInt(11);
        int attempts = 0;
        boolean isGameover = false;

        Scanner sc = new Scanner(System.in);

    
        while (!isGameover) {
            System.out.println("Choose the number b/w 0 to 10");
            int userInput = sc.nextInt();
            if(sysInput==userInput){
                System.out.println("Game over");
                attempts++;

                System.out.println("User input = "+userInput);
                System.out.println("System input = "+sysInput);
                System.out.println("Attempts = "+attempts);
            }

            else if(userInput>10 || userInput<0){
                System.out.println("choose the correct number ");
                userInput = sc.nextInt();
                attempts++;

            }
            else{
                attempts++;
                System.out.println("NUmber not matched");
            }
           
        }

    }

}
