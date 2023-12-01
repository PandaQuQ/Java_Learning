package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = genRandom4();
        System.out.println("The secret code is prepared: ****.");
        Scanner sc = new Scanner(System.in);
        int answer;
        int cows;
        int bulls;
        int[] digits = getDigits(num);
        for (int i =1;true;i++){
            System.out.println("Turn "+i+". Answer:");
            //answer = sc.nextInt();
            answer = genRandom4();
            System.out.println(answer);
            cows = bulls = 0;

            //  Check the range of the input
            if (answer<1000 || answer>9999){
                System.out.println("Wrong input! This should be a 4-digit code!");
                break;
            }
            int[] guess = getDigits(answer);
            for (int j = 0; j<4 ; j++){
                for (int k = 0; k < 4; k++){
                    if (digits[j]==guess[k]){
                        if(j == k){
                            bulls++;
                        }else {
                            cows++;
                        }
                    }
                }
            }
            System.out.print("Grade: ");
            if (cows == 0 && bulls == 0){
                System.out.println("None.");
            } else if (cows == 0) {
                if (bulls>1){
                    System.out.println(bulls+" bulls.");
                }else{
                    System.out.println(bulls+" bull.");
                }
            } else if (bulls == 0) {
                if (cows>1){
                    System.out.println(cows+" cows.");
                }else {
                    System.out.println(cows+" cow.");
                }
            } else {
                if (bulls>1){
                    System.out.print(bulls+" bulls");
                }else {
                    System.out.print(bulls+" bull");
                }
                if (cows>1){
                    System.out.print(" and "+cows+" cows.\n");
                }else {
                    System.out.print(" and "+cows+" cow.\n");
                }
            }

            if (bulls == 4){
                System.out.println("Congrats! The secret code is "+answer+".");
            }

        }
    }

    public static int genRandom4(){

        ArrayList<Integer> numPool = new ArrayList<Integer>();
        for (int i = 0; i<10; i++){numPool.add(i);}
        int number = 0;
        int randIndex;
        for (int i = 0; i<4 ; i++){

            randIndex = new Random().nextInt(0,9-i);
            if (i==3){do {
                randIndex = new Random().nextInt(0,9-i);
            }while (randIndex!=0);
            }
            number = number + numPool.get(randIndex)*(int)Math.pow(10,i);
            numPool.remove(randIndex);
        }

        return number;
    }
    public static int[] getDigits(int a){

        double tmp = a;
        int length = (int)Math.log10(tmp)+1;
        //System.out.println("Debug:"+(int)tmp);
        int[] digitsArray = new int[length];

        // i = 1; i++
        digitsArray[0] = a / (int)Math.pow(10,length-1);
        for (int i = 1; i<length;i++){digitsArray[i] = (a % (int)Math.pow(10,length-i))/(int)Math.pow(10,length-i-1);}
        return digitsArray;
    }

}
