import java.util.Scanner;

public class UserInputExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String Name = sc.nextLine();
        System.out.println("Please enter yout age:");
        int Age = sc.nextInt();
        System.out.println("Please enter height in meters:");
        double height = sc.nextDouble();
        System.out.println("Your name: " + Name + " Your age: " + Age + " Your height: " + height);
    }
}