public class StaticExample {
    public static double setValue1(double a){
        return a=a+10;
    }
    public static double setValue2(double a){
        return a=a+100;
    }
    public static void main(String[] args) {
        System.out.println(setValue1(1)); 
        //StaticExample Obj1 = new StaticExample();
        System.out.println(setValue2(2));
    } 
}
