import java.util.Scanner;

public class Animal {
    protected String sound;
    public void makeSound(){
        System.out.println("");
    }
}

/**
 * Cat extends Animal
 */
class Cat extends Animal {
    public void makeSound(){
        System.out.println("Dang");
    }
}

class creator {
    public static void main(String[] args) {
        // Cat d = new Cat();
        // d.makeSound();
        // Car Aryan = new Car();
        // Aryan.drive();
        // Rectangle Grover = new Rectangle();
        // Grover.lwSetter();
        // Grover.getArea();
        // Circle Stella = new Circle();
        // Stella.rSetter();
        // Stella.getArea();
        // Stella.getPerimeter();
        SavingAccount Isaac = new SavingAccount();
        Isaac.getBalance();
        Isaac.deposit();
        Isaac.withdraw();
    }
    
}

class Vehicle{
    void drive(){
        System.out.println("Vroom");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
//  class Shape
class Shape{
    void getArea(){
        System.out.println("");
    }
    void getPerimeter(){
        System.out.println("");
    }
}
/**
 * Rectangle
 */
class Rectangle extends Shape{
    protected double l,w;
    void lwSetter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the rectangle: ");
        this.l = sc.nextDouble();
        System.out.println();
        System.out.print("Please enter the width of the rectangle: ");
        this.w = sc.nextDouble();
        System.out.println();
        sc.close();
    }
    void getArea(){
        System.out.println("The area of this rectangle is "+ l*w);
    }
}
/**
 * Circle extends Shape
 */
class Circle extends Shape{
    protected double r;
    void rSetter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radium of the circle: ");
        this.r = sc.nextDouble();
        System.out.println();
        sc.close();
    }
    void getArea(){
        System.out.println("The area of this Circle is "+Math.PI*r*r);
    }
    void getPerimeter(){
        System.out.println("The perimeter of this Circle is "+Math.PI*2*r);
    }
}

class BankAccount{
    protected double balance = 0;
    void getBalance(){
        System.out.println("Your balance is "+balance);
    }
    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your balance is "+balance+"\nEnter the amount you want to deposit: ");
        balance = balance + sc.nextDouble();
        System.out.println("Deposit successful.\nYour balance is now "+balance);
    }
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your balance is "+balance+"\nEnter the amount you want to withdraw: ");
        balance = balance - sc.nextDouble();
        System.out.println("Withdral successful.\nYour balance is now "+balance);
    }
}

class SavingAccount extends BankAccount{
    void withdraw(){
        if (balance >= 100){
            Scanner sc = new Scanner(System.in);
            System.out.print("Your balance is "+balance+"\nEnter the amount you want to withdraw: ");
            double amount = sc.nextDouble();
            if (amount<=balance-100){
                balance = balance - amount;
                System.out.println("Withdral successful.\nYour balance is now "+balance);
            }else{
                System.out.println("You don't have enough money in your account.\nYou should have at least 100 in your account left.\nYour balance is "+balance);
            }
        }else{
            System.out.println("Your balance is now "+balance+".\nYour balance is less than 100, you can not do this.");
        }
    }
}
