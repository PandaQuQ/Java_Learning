import java.util.Scanner;

public class assign_27_Oct {
    /*Accept an input and check if it is an integer.*/

    public static void assign_27_Oct_1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            sc.nextInt();
            System.out.println("Yeah!");
        } catch (Exception e) {
            System.out.println("No");
        }
        sc.close();
    }

    /*
    Accept three numbers and to print the largest value.
     */
    public static void assign_27_Oct_2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int num_new = sc.nextInt();
        int num_old = num_new;
        for (int i = 1; i >= 0; i--) {
            System.out.println("Please enter an integer:");
            num_new = sc.nextInt();
            if (num_old < num_new) {
                num_old = num_new;
            }
        }
        sc.close();
        System.out.println(num_old);
    }

    /*
     Accepts an input and prints the closest integers.
     For example if the user inputs 6.25, then closest integer is 6.
     If the user inputs 6.75, then closest integer is 7.
     */
    public static void assign_27_Oct_3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        double num = sc.nextDouble();
        sc.close();
        double remain = num % 1;
        if (remain >= 0.5) {
            num = (int) (num + 1 - remain);
        } else {
            num = (int) (num - remain);
        }
        System.out.println(num);
    }

    /*
    In the UK, purchase of certain items such as Alcohol drinks and Tabaco
    products requires age check. Asks the user for their year of birth, if the
    person is older than 23 years old, then print (“Purchase Permitted”), if not,
    print “Purchase not permitted due to age restrictions”.
     */

    public static void assign_27_Oct_4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        sc.close();
        if (age >= 23) {
            System.out.println("“Purchase Permitted");
        } else {
            System.out.println("Purchase not permitted due to age restrictions");
        }

    }

    public static void while_for_do_convert1(String[] args) {
        int x = 15;
        while (x < 20) {
            System.out.println("value of x : " + x);
            x++;
        }
    }

    public static void while_for_do_convert2(String[] args) {
        int x = 15;
        for (int i = 15; i < 20; i++) {
            System.out.println("value of x : " + x);
            x++;
        }
    }


    public static void while_for_do_convert3(String[] args) {
        int x = 15;
        do {
            System.out.println("value of x : " + x);
            x++;
        } while (x < 20);
    }

    public static void multiplication_table(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print("  ");
            }
        }
    }


    public static void AgewithChecks(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initial value
        System.out.print("Please enter your age: \n");
        double Age = Math.abs(sc.nextDouble()); // Positive int
        sc.close();
        int Counter = 1;
        // Ask until an integer is entered
        while ((Counter <= 3) & (Age % 1 != 0 | Age < 0 | Age > 150)) {
            Counter++;
            if (Age % 1 != 0) {
                System.out.print("Please enter your age as an integer: \n");
            } else { // why not to use else if?
                System.out.print("Your age should be between 1 and 150. \n");
                System.out.print("Please enter your age again: \n");
            }
            Age = Math.abs(sc.nextDouble()); // Positive int
        }
        if (Counter <= 3) {
            System.out.print("Your Year of Birth is: ");
            System.out.print(2023 - Age);
        } else {
            System.out.print("You have entered three incorrect inputs. Exiting the program. ");
        }
    }




}

