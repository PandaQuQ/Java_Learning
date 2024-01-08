import java.util.Scanner;

public class TriangleClass {
    public static double Circumference(double a,double b,double c){
        return a+b+c;
    }
    public static double Area(double a,double b,double c, double s){
        double s2 = s/2;
        return Math.sqrt(s2*(s2-a)*(s2-b)*(s2-c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length a,b,c line by line:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = Circumference(a,b,c);
        double area = Area(a, b, c, s);
        System.out.println("Circumference: " + s);
        System.out.println("Area: " + area);

    }
}
