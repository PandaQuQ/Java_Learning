import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class revison_practice {
    public static void main(String[] args) {
        //Q1();
        //revision_class_Q2.main(args);
        Q3();
    }
    public static void Q1(){
        int[] dupArray = new Random().ints(10, 0, 10).toArray();
        for (int i: dupArray){System.out.print(i+" ");}
        System.out.println();

        List<Integer> newList = new ArrayList<>();
        int tmp = 0 ;
        for (int i = 0;i<dupArray.length;i++){
            //System.out.print("dang"+dupArray[i]+" ");
            for (int j = i+1; j<dupArray.length;j++){
                if (dupArray[j] == dupArray[i]) {
                    tmp++;
                }
            }
            if(tmp == 0){
                newList.add(dupArray[i]);
            }
            System.out.print(tmp + " ");
            tmp = 0;
        }
        System.out.println(newList);
        //for (int i: newList){System.out.print(i+" ");}

        //  convert arraylist to array

        Integer[] dang = newList.toArray(new Integer[newList.size()]);
        //for (int i: dang){System.out.print(i+" ");}
        
        System.out.println(dang.length);
        }
        public static char findMid(String a) {
            int middle = a.length()/2;
            if (middle%2 == 0) {
                middle = middle - middle%1;
            }
            
            return a.charAt(middle);
        }
        public static void Q3() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a string: ");
            String aString = sc.next();
            System.out.println();
            System.out.println(findMid(aString));
        }

    
}
