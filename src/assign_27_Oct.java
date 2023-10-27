import java.util.Scanner;

public class assign_27_Oct {

    public static void assign_27_Oct_1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            int num_1 = sc.nextInt();
            System.out.println("Yeah!");
        } catch (Exception e) {
            System.out.println("No");
        }
    }
    public static void assign_27_Oct_2(String[] args) {
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
    public static void assign_27_Oct_3(String[] args) {
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

    public static void assign_27_Oct_4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if (age>=23){
            System.out.println("“Purchase Permitted");}else{
            System.out.println("Purchase not permitted due to age restrictions");
        }

    }
}
