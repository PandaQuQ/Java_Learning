 
import java.util.Scanner;

public class revision_class_Q2 {
    public static void main(String[] args) {
        minMaxDecision();
    }
    public static void minMaxDecision(){
        Scanner sc = new Scanner(System.in);
        //input 3 ints
        System.out.print("This program will accept 3 int inputs and tell you what the largest and smallest numbers are.\nPlease enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("2nd: ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("3rd: ");
        int c = sc.nextInt();
        System.out.println();
        sc.close();

        //compare
        int largest, smallest;

        if (a >= b && a >= c) {
            largest = a;
        }else if(b>=c){largest = b;}else{largest = c;}

        if (a <= b && a <= c) {
            smallest = a;
        }else if(b<=c){smallest = b;}else{smallest = c;}
        
        //print
        System.out.println("The largest is "+largest+". The smallest is "+ smallest);
    }
    
}
