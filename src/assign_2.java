import java.util.Scanner;

public class assign_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int num_new = sc.nextInt();
        int num_old = num_new;
        for (int i = 1; i >= 0; i--){
            System.out.println("Please enter an integer:");
            num_new = sc.nextInt();
            if (num_old<num_new){
                num_old = num_new;
            }
        }
        System.out.println(num_old);
    }
}
