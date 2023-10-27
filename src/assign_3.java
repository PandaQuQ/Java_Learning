import java.util.Scanner;

public class assign_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        double num = sc.nextDouble();
        double remain = num % 1;
        if (remain >= 0.5){
            num = (int) (num+1-remain);
        }else {
            num = (int) (num-remain);
        }
        System.out.println(num);
    }
}
