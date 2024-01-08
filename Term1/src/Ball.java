public class Ball {
    private String Colour;
    private static int Number;
    public Ball(String Col, int num){
        this.Colour = Col;
        this.Number = num;
    }
    public String getColour(){
        return Colour;
    }
    public void setColour(String colour){
        Colour = colour;
    }
    public static int getNumber(){
        return Number;
    }
    public static void setNumber(int number){
        Number = number;
    }
}
