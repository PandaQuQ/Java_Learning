public class PrecedenceExample1{
    public static void main(String[] args){
        double x = Math.pow(2,3);
        double z = 3 * Math.pow(4,3);
        double a = 30 + 2 * (120/7 - 1);
        x = x + 2;
        x++;
        int b = 11 % 4;
        double C = Math.abs(x - 200);
        System.out.print("x=" + x + " z=" + z + " a=" + a + " b=" + b + " C=" + C + "\n");

    }
}