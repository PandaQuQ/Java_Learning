import java.util.InputMismatchException;
import java.util.Scanner;

public class mockassignment {
    public static void Q1(){
        int x = 3;
        double y = 6.0; //  Wrong variable type
        int Ave2 = x + (int)y/2;    //  convert the double into int
        System.out.println(Ave2);
    }


    public static void Q6_1(){
        //  Declare a string array which the size is 5
        String[] productStock = new String[5];
        //  Set the 2nd element in the array to a string
        productStock[1] = "New Arrivals";
        //  Set the 4th element in the array to a string
        productStock[3] = "Clearance";
        //  Build a loop which i start from -1, less than 4
        for (int i = -1; i < 4; i++){
            //  Set the i element in the array to a string, and i+=1 after this
            productStock[++i] = "out of stock";
        }
        //  A loop for print the array
        for (String s : productStock){
            System.out.println(s);
        }
    }

    public static void Q6_2(){
        //5 non-repeatable positive even integers
        //3 times attempts
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int[] intArray = new int[5];
        int input;
        int i = 0;
        do {
            if(i == 6){break;}
            try {
                System.out.print("Please enter the "+(i+1)+" number: ");
                input = sc.nextInt();
                if (input<0){
                    attempts++;
                    System.out.println("Please enter a valid value");
                    continue;
                }
                if (input==0){break;}
            }catch (Exception e){
                attempts++;
                System.out.println("Please enter a valid value");
                continue;
            }
            intArray[i] = input;
            i++;
        }while(attempts<4);
        if (attempts!=3){
            int sum = 0;
            for (int x : intArray){sum += x;}
            double average = (double) sum/5;
            int intAverage;
            if (average%1>=0.5){
                intAverage = (int)average + 1;
            }else {intAverage = (int)average;}
            System.out.println(intAverage);
        }

        //Store inputs in to an array, print in ascending order
        //calc the average and round it to its closest integer and print
        //find if the integer average in the array and if it is, print the index of the value(in the sorted array),otherwise print -1
    }
    public static void main(String[] args) {
        //Q1();
        //Q6_1();
        Q6_2();
    }
}
