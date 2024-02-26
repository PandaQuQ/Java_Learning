public abstract class Bird {
    String color;
    String food;
    String movement;
    String call; 
    public Bird(String color, String food, String movement, String call){
        this.color = color;
        this.food = food;
        this.movement = movement;
        this.call = call;
    }
}

abstract class WalkingBird extends Bird {
    public WalkingBird(String color, String food,String call) {
        super(color,food,"walking",call);
    }
    
}

abstract class FlyingBird extends Bird{
    public FlyingBird(String color, String food,String call) {
        super(color,food,"flying",call);
    }
}

/**
 * Parrot extends FlyingBird
 */
abstract class Parrot extends FlyingBird {
    public Parrot(String color,String call){
        super(color, "fruits",call);
    }
    
}

abstract class TalkingParrot extends Parrot{
    public TalkingParrot(String color){
        super(color, "HumanSound");
    }
}

