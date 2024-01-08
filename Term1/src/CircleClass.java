import java.util.Scanner;
public class CircleClass {
    public static double Area(double r) {
        /*
            Method Name: Area
            Argument: radius (double)
            Return: Area of the circle (double)
        */
        return Math.PI * r * r;
    }

    public static double circumference(double r){
        /*
            Method Name: circumference
            Argument: radius (double)
            Return: Circumference of the circle (double)
        */
        return 2 * Math.PI * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println();
        System.out.println("The area of the circle is "+Area(r));
        System.out.println("The circumference of the circle is "+circumference(r));
    }
}
