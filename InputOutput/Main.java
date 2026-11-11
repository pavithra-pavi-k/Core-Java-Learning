package InputOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Enter the age  : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age is =  "+age);

        System.out.println("Enter two number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("sum of num1 and num2 = "+(num1+num2));
    }

}
