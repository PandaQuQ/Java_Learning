import java.util.*;


public class week6Exercises {
    public static void Exercise7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        double grade = sc.nextDouble();
        if (100>=grade){
            if (grade>=0){
                if (grade>=90){
                    System.out.println("Your degree is A");
                } else if (grade>=80) {
                    System.out.println("Your degree is B");
                } else if (grade>=70) {
                    System.out.println("Your degree is C");
                }else if (grade>=60){
                    System.out.println("Your degree is D");
                } else {
                    System.out.println("Your degree is F");
                }
            }else{
                System.out.println("Wrong Value!");
            }
        }else{
            System.out.println("Wrong Value!");
        }
    }

    public static void Exercise8() {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        do {
            System.out.print("This is a program to let u enter two numbers and calculate the sum of them\nPlease enter 1st number: ");
            double a = sc.nextDouble();
            System.out.print("Enter the 2nd number: ");
            double b = sc.nextDouble();
            System.out.println("The sum of these two numbers is "+(a+b));
            System.out.print("Do you want to do it again? (y/n): ");
            char q2 = sc.next().charAt(0);
            if (q2 != 'y'){
                break;
            }
        }while(true);
    }

    public static void Exercise9() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        System.out.println("This is a program to add your input(positive integer) to a sum(start from 0)");
        do {
            System.out.print("Enter the No."+i+" number: ");
            int a = sc.nextInt();
            if (a > 0) {
                sum += a;
                i++;
            }else {
                break;
            }
        }while (true);
        System.out.println("The sum of the "+(i-1)+" numbers are "+sum);
    }

    public static void Exercise10() {
        ArrayList list_a = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("This is a program designed to display the minimum and maximum value frome the list you will enter\nThe exit code is a non-numerical input\n");
        int i = 1;
        double Max = 0;
        double Min = 0;
        do {
            System.out.print("Enter the No."+i+" number: ");
            try {
                list_a.add(sc.nextDouble());
                i++;
                }
            catch(Exception e){
                System.out.println("The Maximium value of these "+(i-1)+"-number list is "+(double) Collections.max(list_a)+", and the minimum value of this is "+(double)Collections.min(list_a));
                break;
            }

        }while (true);
    }

    public static void Exercise11() {
        ArrayList list_a = new ArrayList<>();
        for (int i =101;i<1000;i++){
            if ((Math.pow(((i - i%100 )/100),3)+Math.pow(((i%100 - i%10) /10),3)+Math.pow((i%10),3))==i){
            list_a.add(i);
            }
        }
        for (int i=0;i<list_a.size();i++){
            System.out.println(list_a.get(i));
        }
    }

    public static void Exercise5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer, I'll tell you whether it is a prime number or not: ");
        int num = sc.nextInt();
        int flag = 0;
        if (num == 0 || num == 1){
            System.out.println("\n"+num+" is not a prime number.");
            return;
        }
        for (int i = 2;i<num;i++){
            if (num%i==0){
                System.out.println("\n"+num+" is not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag != 1){
            System.out.println("\n"+num+" is a prime number");
        }





    }
    public static void Exercise6() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a_list = new ArrayList();
        System.out.print("Please enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("\nPlease enter the 2nd number: ");
        int num2 = sc.nextInt();
        int grnum;
        int lsnum;
        if (num2>num1){
            grnum = num2;
            lsnum = num1;
        }else {
            grnum = num1;
            lsnum = num2;
        }
        for (int i = lsnum;i>0;i--){
            if (lsnum%i==0){
                a_list.add(i);
            }
        }
        for (int i = 0; i<a_list.size();i++){
            if (grnum % a_list.get(i)==0){
                System.out.println("The HCF of "+num1+" and "+num2+" is "+a_list.get(i));
                break;
            }
        }

    }

    public static void Exercise12(){
        //a)
        int[] intArray1 = new Random().ints(10, 1, 10).toArray();
        for (int i = 0;i<intArray1.length;i++){
            System.out.print(intArray1[i]+" ");
        }
        System.out.println();
        //b)
        System.out.println(intArray1[8]);
        //c)
        intArray1[4] = 100;
        //d)
        intArray1[7] = intArray1[0]+intArray1[1]+intArray1[2]+intArray1[3];
        for (int i:intArray1) System.out.print(i+" ");
    }
    public static void Exercise13(){
        Scanner sc = new Scanner(System.in); ArrayList<String> name_list = new ArrayList<>();
        for (int i : new int[]{1, 2, 3, 4}) {System.out.print("\nPlease enter the "+i+" name: ");name_list.add(sc.next());}
        //a)
        List<String> asc = new ArrayList<>(name_list); Collections.sort(asc);
        //c)
        List<String> dsc = new ArrayList<>(asc); Collections.reverse(dsc);
        System.out.println("Ascending Order");for (String i : asc) System.out.print(i+" ");
        //b)
        System.out.println("\nOriginal Order");for (String i : name_list) System.out.print(i+" ");
        System.out.println("\nDescending Order");for (String i : dsc) System.out.print(i+" ");
    }
    public static void Exercise14(){
        Scanner sc = new Scanner(System.in);
        int num = new Random().nextInt();//System.out.println(num);
        int guess;
        for (int i = 0; i<10;i++) {System.out.print("Please take a guess: ");guess = sc.nextInt();if(guess>num){System.out.println("too high");}else if(guess<num){System.out.println("too low");}else{System.out.println("Bingo");break;}}
        System.out.println("The number is "+num);
    }
    public static double getFact(double num){
        if (num == 1||num == 0){
            return 1;
        }else {
            return num *= getFact(num-1);
        }

    }
    public static void Exercise15() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter x: ");int x = sc.nextInt();
        System.out.print("\nEnter n: ");int n = sc.nextInt();
        System.out.println();
        if(n==1){System.out.println(1);}else{for (int i = 1; i <= n; i++) {sum += -Math.pow(-1, i) * Math.pow(x, 2 * i - 1) / getFact(2 * i - 1);}System.out.println(sum);}

    }

    public static void Exercise16(){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter x: ");int x = sc.nextInt();
        System.out.print("\nEnter n: ");int n = sc.nextInt();
        System.out.println();
        if(n==1){System.out.println(sum);}else{for (int i = 1; i <= n; i++){sum+=-Math.pow(-1,i)*Math.pow(x,2*(i-1))/getFact(2*(i-1));}System.out.println(sum);}

    }

    public static void Exercise17(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");int n = sc.nextInt();
        double sum = 0;
        for (double i = 1; i<=n;i++){sum+=(1/i);}
        System.out.println("\n"+sum);
    }
    public static void Exercise18(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");int n = sc.nextInt();
        double sum = 0;
        for (double i = 1; i<=n;i++){sum+=-Math.pow(-1,i)*(1/i);}
        System.out.println("\n"+sum);
    }
    public static void assignment(){
        double i = 0;
        double sum = 0;
        do {i++;sum+=-Math.pow(-1,i)*(1/i);if (Math.abs(sum-Math.log(2))<0.01){System.out.println(i);break;}}while(true);
    }
    public static void main(String[] args) {
        //Exercise7();
        //Exercise8();
        //Exercise9();
        //Exercise10();
        //Exercise11();
        //Exercise5();
        //Exercise6();
        //Exercise12();
        //Exercise13();
        //Exercise14();
        //Exercise15();
        Exercise15();
        //Exercise16();
        //Exercise17();
        //Exercise18();
        //assignment();
    }
}

