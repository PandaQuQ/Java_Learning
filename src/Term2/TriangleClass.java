import java.util.Scanner;

public class TriangleClass {
    //3 sides
    double a,b,c;
    //3 angles
    double d,e,f;

    public static double Area(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static double circumference(double a, double b, double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in first length: ");
        double a = sc.nextDouble();
        System.out.println();

        System.out.print("Type in second length: ");
        double b = sc.nextDouble();
        System.out.println();

        System.out.print("Type in third length: ");
        double c = sc.nextDouble();
        System.out.println();

        System.out.print("Type in first angle: ");
        double d = sc.nextDouble();
        System.out.println();

        System.out.println("The area of this triangle is "+Area(a, b, c)+"\nThe circumference of this triangle is "+circumference(a, b, c));
        
        

        System.out.print("Type in second angle: ");
        double e = sc.nextDouble();
        System.out.println();

        System.out.print("Type in third angle: ");
        double f = sc.nextDouble();
        System.out.println();

        System.out.println("The area of this triangle is "+Area(a, b, c)+"\nThe circumference of this triangle is "+circumference(a, b, c));
        sc.close();
    }
}
