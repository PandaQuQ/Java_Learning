 
import java.util.*;
import java.util.List;

public class Week6ExercisePlus {
    public static void Exercise1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Monkey a's status: ");Boolean a_smile = sc.nextBoolean();
        System.out.print("\nEnter the Monkey b's status: ");Boolean b_smile = sc.nextBoolean();
        if (a_smile == b_smile) {System.out.println("True");}
        sc.close();
    }

    public static void Exercise2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the 1st integer: ");int num_1 = sc.nextInt();
        System.out.print("Enter the the 2nd integer: ");int num_2 = sc.nextInt();double sum = num_1 + num_2;System.out.println(sum);
        sc.close();    
    }

    public static void Exercise3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: "); int n = sc.nextInt();
        if (n<=21){System.out.print(Math.abs(n-21));}else{System.out.print(2*Math.abs(n-21));}
        sc.close();
    }
    public static void Exercise4(){
        int hour = new Random().nextInt(0,23);
        if (hour<7||hour>20){System.out.println("True");
    }
    }

    public static void Exercise5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); int a = sc.nextInt();
        System.out.print("Enter b: "); int b = sc.nextInt();
        if (a==10||b==10||a+b==10){System.out.println("True");}
        sc.close();
    }

    public static void Exercise6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: "); String str = sc.nextLine();
        if(!str.startsWith("not")){
            List<String> str_list = new ArrayList<String>(Arrays.asList(str.split(" ")));
            str_list.addFirst("not");
            str=String.join(" ",str_list);
        }
        System.out.println(str);
        sc.close();
    }

    public static void Exercise7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: "); String str = sc.nextLine();
        ArrayList<String> str_list = new ArrayList<String>(Arrays.asList(str.split("")));
        String tmp = str_list.get(0);
        str_list.set(0,str_list.get(str_list.size()-1));
        str_list.set(str_list.size()-1,tmp);
        str=String.join("",str_list);
        System.out.println(str);
        sc.close();
    }

    public static void Exercise8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: "); String str = sc.nextLine();String tmp = new String(str);
        System.out.print("Enter a n: "); int n = sc.nextInt();
        for (int i=1;i<n;i++){str+=tmp;}
        System.out.println(str);
        sc.close();

    }

    public static int[] Exercise9(){
        int[] numArray = new Random().ints((int)(Math.random()*99)+1,-20,20).toArray();
        //for(int i : numArray){System.out.println(i);}
        if(numArray[0]==6||numArray[numArray.length-1]==6){System.out.println(6);return numArray;}else{return null;}
    }

    public static void tester_9(){
        do {
            int[] a = Exercise9();
            if (a!=null){
                for (int i : a){System.out.print(i+" ");}
                break;
            }

        }while (true);
    }

    public static int Exercise10(){
        int[] numArray_1 = new Random().ints((int)(Math.random()*99)+1,-20,20).toArray();
        int[] numArray_2 = new Random().ints((int)(Math.random()*99)+1,-20,20).toArray();
        if(numArray_1[0]==numArray_2[0]||numArray_1[numArray_1.length-1]==numArray_2[numArray_2.length-1]){for (int i : numArray_1){System.out.print(i+" ");}System.out.println();for (int i : numArray_2){System.out.print(i+" ");}return 1;}else{return 0;}
    }

    public static void tester_10(){
        do {
            if (Exercise10()==1){break;}
        }while (true);
    }

    public static void Exercise11(){
        int[] numArray = new Random().ints(3).toArray();
        int sum = 0;
        for (int i : numArray){sum+=i;System.out.print(i+" ");}System.out.println("\n"+sum);
    }

//    public static List intArrtoList(int[] arr ){
//        //List<Integer> lst = new List<Integer>();
//        //for (int i : arr){lst.add(i);}
//    }
    public static int[] lRotate(int[] a){
        int[] rotated = new int[a.length];
        for (int i = 0;i<a.length-1;i++){
            rotated[i] = a[i+1];
        }
        rotated[a.length-1] = a[0];
        return rotated;
    }
    public static void Exercise12(){
        int[] numArray = new Random().ints(3,-100,100).toArray();
        System.out.println("Original Array"); for (int i : numArray){System.out.print(i+" ");}
        numArray = lRotate(numArray);
        System.out.println("\nLeft rotated array");for (int i : numArray){System.out.print(i+" ");}
    }

    public static int[] reserver(int[] a){
        int[] reservedArray = new int[a.length];
        for (int i=0; i<a.length;i++){reservedArray[i]=a[a.length-1-i];}
        return reservedArray;
    }
    public static void Exercise13(){
        int[] numArray = new Random().ints(3,-100,100).toArray();
        for (int i : numArray){System.out.print(i+" ");};System.out.println();
        numArray = reserver(numArray);
        for (int i : numArray){System.out.print(i+" ");}
    }

    public static int[] arrayValueReplacer(int[] a, int b){
        for (int i = 0; i <a.length;i++){a[i] = b;}
        return a;
    }
    public static void Exercise14(){
        int[] numArray = new Random().ints(3,-100,100).toArray();
        for (int i : numArray){System.out.print(i+" ");};System.out.println();
        if (numArray[0]<numArray[numArray.length-1]){numArray=arrayValueReplacer(numArray,numArray.length-1);}else{numArray=arrayValueReplacer(numArray,numArray[0]);}
        for (int i : numArray){System.out.print(i+" ");};System.out.println();
    }

    public static void Exercise15(){
        int[] numArray1 = new Random().ints(3,-100,100).toArray();
        int[] numArray2 = new Random().ints(3,-100,100).toArray();
        System.out.println("1st array");for (int i : numArray1){System.out.print(i+" ");};System.out.println();
        System.out.println("2nd array");for (int i : numArray2){System.out.print(i+" ");};System.out.println();
        int[] middleArray = {numArray1[1],numArray2[1]};
        System.out.println("middle array");for (int i : middleArray){System.out.print(i+" ");};System.out.println();
    }

    public static void Exercise16(){
        int[] numArray = new Random().ints((int)(Math.random()*49)+1,-20,20).toArray();
        int[] newArray = {numArray[0],numArray[numArray.length-1]};
        System.out.println("Original array");for (int i : numArray){System.out.print(i+" ");};System.out.println();
        System.out.println("new array");for (int i : newArray){System.out.print(i+" ");};System.out.println();
    }

    public static void Exercise17(){
        int[] numArray = new Random().ints(2,-100,100).toArray();
        System.out.println("Original array");for (int i : numArray){System.out.print(i+" ");};System.out.println();
        for (int i : numArray){if (i==2||i==3){System.out.print("True");break;}}
    }

    public static void Exercise18(){
        int day = new Random().nextInt(1,7);
        int cigar = new Random().nextInt(1,2147483647);
        System.out.println("Day: "+day+"\nCigars "+cigar);
        Boolean ifWeekend = Boolean.TRUE;
        if (day <= 5){ifWeekend = Boolean.FALSE;}
        if(ifWeekend){if (cigar>40){System.out.println("True");}else{System.out.println("False");}}else{if (cigar>40&&cigar<60){System.out.println("True");}else{System.out.println("False");}}
    }

    public static void Exercise19(){
        //int you=randint(0,10), int date=randint(0,10), int result=1
        // you||date>=8, result = 2
        // you||date<=2, result = 0
        int you = new Random().nextInt(0,10); int date = new Random().nextInt(0,10); int result = 1;
        System.out.println("Your stylishness: "+ you); System.out.println("Your date's stylishness: "+ date);
        if (you>=8||date>=8){result=2;} if (you<=2||date<=2){result=0;}
        switch (result){
            case 0:
                System.out.println("You can't get the table");
            case 1:
                System.out.println("You may get the table");
            case 2:
                System.out.println("You obviously can get the table");
        }
    }

    public static void Exercise20(){
        Boolean bd = new Random().nextBoolean();
        int speed = new Random().nextInt(0,120);
        int ticket = 0;
        if (bd){speed+=5;System.out.println("Today is your birthday, you drive 5 more faster");}
        System.out.println("Your speed is "+speed);
        if (speed>80){ticket = 2;}else if (81>speed && speed>60){ticket = 1;}
        System.out.println(ticket);
        if(ticket==0){System.out.println("You have no tickets.");} else if (ticket ==1) {System.out.println("You get a small ticket");}else{System.out.println("You get a big ticket! You are in trouble mate!");}
    }

    public static int Exercise21(){
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        int sum = a + b;
        System.out.println("Original sum is "+sum);
        if (sum>=10 && sum<=19){sum = 20;}
        System.out.println("New sum is "+sum);
        return sum;
    }


    public static void main(String[] args) {
        //Exercise1();
        //Exercise2();
        //Exercise3();
        //Exercise4();
        //Exercise5();
        //Exercise6();
        //Exercise7();
        //Exercise8();
        //Exercise9();
        //tester_9();
        //Exercise10();
        //tester_10();
        //Exercise11();
        //Exercise12();
        //Exercise13();
        //Exercise14();
        //Exercise15();
        //Exercise16();
        //Exercise17();
        //Exercise18();
        //Exercise19();
        //Exercise20();
        Exercise21();
    }
}
