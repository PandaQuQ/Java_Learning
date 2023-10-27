import java.util.Scanner;

public class assign_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if (age>=23){
            System.out.println("“Purchase Permitted");}else{
            System.out.println("Purchase not permitted due to age restrictions");
        }

    }
}
