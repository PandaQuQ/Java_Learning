 
import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and I'll give you the cubic of it as return: ");
        float num = sc.nextFloat();
        sc.close();
        System.out.println( cubic(num));;
    }
    public static float cubic(float a) {
        float result = a * a * a;
        return result;
    }
}
