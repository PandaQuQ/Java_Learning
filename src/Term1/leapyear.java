 
import java.util.Scanner;
public class leapyear {
    //leap year program
    //2024 is a leap year
    public static void main(String[] args) {
        //leapyear(args);
        //distance(args);
        arrayProduct(args);
    }
    public static void isLeapyear(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which year do u want to type in: ");
        int year = sc.nextInt();
        sc.close();
        System.out.println();

        if (Math.abs(year - 2024) % 4 == 0){
            if (Math.abs(year - 100) % 100 == 0) {
                System.out.println(year+" is not a leap year");
            }else{
                System.out.println(year+" is a leap year");
            }
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
    public static void distance(String[] args){
        Scanner sc = new Scanner(System.in);
        //User input
        System.out.print("How far did you go(the distance in kilometers): ");
        float distance = sc.nextFloat();
        System.out.println();
        System.out.print("How much time did you take(in seconds): ");
        float seconds = sc.nextFloat();
        sc.close();
        System.out.println();
        float hourspeed = seconds / 60 / 60 /distance;
        float minutespeed = seconds / 60 /distance;
        float secondspeed = seconds / distance;
        System.out.println("Your speed is\n" + hourspeed + " km/h\n"+minutespeed+" km/minute\n"+secondspeed+" km/seconds\n");
        System.out.println("Your speed is\n" + hourspeed/1609 + " miles/h\n"+minutespeed/1609+" miles/minute\n"+secondspeed/1609+" miles/seconds\n");

    }
    public static void arrayProduct(String[] args) {
        int[] simpleArray= {2,3,5,7,-7,5,8,-5};

        //find maximum 2 elements
        int MAX1 = -9999999;
        for (int i : simpleArray){if (i>=MAX1) {
            MAX1 = i;
            //System.out.println("."+MAX1);
        }}
        int MAX2 = -9999999;
        for (int j : simpleArray){
            if (j>=MAX2 && j!=MAX1) {
                MAX2 = j;
                //System.out.println(".."+MAX2);
            }
        }
        System.out.println(MAX1*MAX2);

        }
    
}
