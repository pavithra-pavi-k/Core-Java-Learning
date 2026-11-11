package ConstructorExample;


class Person{
    int balance;
    String name;

    Person(){
        System.out.println("Person Bank Account balance ...");
    }


Person(int balance , String name){
    this.balance = balance;
    this.name = name;
    System.out.println("Person balance is : "+balance);
    System.out.println("Person name is :"+name);

    }

}

public class BankAccount {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        Person p2 = new Person(2000,"Pavithra");
    }

}
