import java.util.Random;
import java.util.Scanner;

public class Exercisesmore {
    public static void main(String[] args) {
        //E1();
        //E2();
        E3();
    }
    public static void E1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double inches = sc.nextDouble();
        System.out.println();
        double meters = inches/39.37;
        System.out.println(inches+" inches is equal to "+meters+" meters");
    }

    public static void E2(){
        int a = new Random().nextInt(1,100);
        int b = new Random().nextInt(0,100);
        int c = new Random().nextInt(0,100);
        System.out.println("Random Quadratic equation is "+a+"x^2+"+b+"x+"+c+"=0");
        double rooteq = b*b-4*a*c;
        double r1,r2;
        if (rooteq>0){
            r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("It has two different roots, r1="+r1+" r2="+r2);
        }else if (rooteq == 0){
            r1 = r2 =(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("It has two same roots: "+r1);
        }else {
            System.out.println("No real roots for it");
        }
        //b^2-4ac>=0
    }
    public static void E3(){
        int[] intArray = new Random().ints(30).toArray();
        for (int i : intArray){
            System.out.print(i+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the element that you want to insert: ");
        int o = sc.nextInt();
        System.out.println();
        System.out.print("Please enter the index that where you want to insert:");
        int ind = sc.nextInt();
        System.out.println();
        int[] newIntArray = new int[intArray.length+1];
        for (int i=0; i<ind+1;i++){
            newIntArray[i]=intArray[i];
        }
        newIntArray[ind] = o;
        for (int i=ind+1;i<intArray.length;i++){
            newIntArray[i] = intArray[i-1];
        }
        for (int i : newIntArray){
            System.out.print(i+" ");
        }

    }



}
