import java.util.Scanner;

public class Exercise24Nov {

    public static double power(double x, double y) {
        if (y == 0){
            return 1;
        }else {
            double result = 1;
            for (int i = 1;i<=y;i++){
                result *= x;
            }
            return result;
        }

    }
    public static void Exercise1a(){
        Scanner sc = new Scanner(System.in);
        System.out.print("This program will return the result of x^y\nPlease enter x: ");
        double x = sc.nextDouble();
        System.out.print("\nPlease enter y: ");
        double y = sc.nextDouble();
        double result = power(x,y);

        System.out.println("\nThe result is "+result);
    }

    public static void Exercise4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("This program will return the revenue of the good\nPlease enter the item price: ");
        double x = sc.nextDouble();
        System.out.print("\nPlease enter the quantity of this item sold: ");
        double y = sc.nextDouble();
        double Revenue = x * y;
        if (Revenue > 10000){
            Revenue *= 0.95;
        }
        System.out.println("\nThe revenue is "+Revenue);
    }

    public static void Exercise5() {
        Scanner scanner = new Scanner(System.in);
        int flag_1 = 0;
        int flag_2 = 0;

        while (flag_1 == 0) {
            while (flag_2 == 0) {
                try {
                    System.out.print("Part 1\nPlease enter an integer between 1 and 100: ");
                    int a = scanner.nextInt();
                    flag_1 = 1;

                    if (a >= 1 && a <= 100) {
                        flag_2 = 1;
                        System.out.println("a) " + a + " is between 1 and 100");
                        double a_sqrot = Math.sqrt(a);
                        if (1 < a && a <= 3) {
                            System.out.println("b) " + a + " is a prime number");
                        } else if (a == 1) {
                            System.out.println("b) " + a + " is not a prime number");
                        } else {
                            int smallest_factor = 0;
                            for (int x = 2; x < a_sqrot + (21 % 5 > 0 ? 1 : 0); x++) {
                                if (a % x == 0) {
                                    System.out.println("b) " + a + " is not a prime number");

                                    if (a % 2 == 0) {
                                        smallest_factor = 2;
                                    } else if (a % 3 == 0) {
                                        smallest_factor = 3;
                                    } else if (a % a_sqrot == 0) {
                                        smallest_factor = (int) a_sqrot;
                                    }

                                    System.out.println("c) The smallest prime factor is " + smallest_factor);
                                    break;
                                }
                            }

                            if (smallest_factor == 0) {
                                System.out.println("b) " + a + " is a prime number");
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("What did you type in? You should enter an INTEGER");
                    scanner.nextLine();
                } finally{
                    //System.out.println("a) " + a + " is not between 1 and 100");
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        //Exercise1a();
        Exercise4();
    }

}

