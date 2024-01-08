import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value of x: ");
        double x=sc.nextDouble();
        System.out.println("Please enter number of iterations: ");
        int n=sc.nextInt();
        double cosx=1;// initial value
        for (int i=2;i<=n;i++){
            double factorial=1;
            for (int j=2*(i-1);j>=1;j--){
                factorial=factorial*j;
            }
            double num1=Math.pow(-1,i-1);
            double num2=Math.pow(x,2*(i-1));
            cosx=cosx+(num1*num2/factorial);
        }
        System.out.println("Value of sin("+x+") is: "+ cosx);
    }
}