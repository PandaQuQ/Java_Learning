import java.util.Scanner;

import static java.lang.Math.pow;

public class Assignment {
    public static void main(String[] args){
        int r0 = 0;
        int v = 2;
        int a =1;
        double t = 0;
        double r = r0 + v * t - 1 / 2 * a * Math.pow(t,2);
        //a
        System.out.println("a) " + r);
        t = 2;
        r = r0 + v * t - 1 / 2 * a * Math.pow(t,2);
        //b
        System.out.println("b) " + r);
        Scanner sc = new Scanner(System.in);
        //c
        System.out.println("c) Please enter a time: ");
        t = sc.nextDouble();
        r = r0 + v * t - 1 / 2 * a * Math.pow(t,2);
        System.out.println("c) " + r);
    }
}
