import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        System.out.println(cubic(num));
        
    }

    public static double cubic(double n){
        return Math.pow(n, 3);
    }
}
