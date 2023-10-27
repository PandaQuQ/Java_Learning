import java.util.Scanner;

public class assign_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            int num_1 = sc.nextInt();
            System.out.println("Yeah!");
        } catch (Exception e) {
            System.out.println("No");
        }
    }
}
