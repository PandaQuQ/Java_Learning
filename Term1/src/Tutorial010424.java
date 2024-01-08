import java.util.Random;
import java.util.Scanner;

public class Tutorial010424 {
    public static void main(String[] args) {
        Q1();
    }

    public static void Q1(){
        int[] intArray = new Random().ints(5,0,99).toArray();
        for (int i : intArray){
            System.out.print(i + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element which you want to insert: ");
        int e = sc.nextInt();
        System.out.println();

        System.out.print("Enter the index that where you want to insert the element: ");
        int ind = sc.nextInt();
        System.out.println();

        int [] newIntArray = new int[intArray.length + 1];

        for (int i = 0; i < ind + 1; i++){
            newIntArray[i] = intArray[i];
        }
        newIntArray[ind] = e;
        for (int i = ind + 1; i < intArray.length + 1; i++){
            newIntArray[i] = intArray[i - 1];
        }


        for (int i : newIntArray){
            System.out.print(i + " ");
        }
    }





}
