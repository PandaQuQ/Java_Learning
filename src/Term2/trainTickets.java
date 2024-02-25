public abstract class trainTickets {
    protected String time;
    protected double price;
    protected String cate;
    trainTickets(String time, Double price,String cate){
        this.time = time;
        this.price = price;
    }

     
}
abstract class offPeak extends trainTickets{
    offPeak(String time,double price){
        super(time, price, "offPeak");
    }
}
abstract class peakTime extends trainTickets{
    peakTime(String time,double price){
        super(time, price, "peakTime");
    }
}
abstract class anyTime extends trainTickets{
    anyTime(String time,double price){
        super(time, price, "anyTime");
    }
}
