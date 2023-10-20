import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args){
        int count = 0;
        int input_num = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=3; i++){
            System.out.println("Enter number "+ i + ": ");
            input_num = sc.nextInt();
            if (input_num%2 == 0){
                count++;
            }
        }
        System.out.println(count + " even number(s)");
    }
}
