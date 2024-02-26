/**
 * Example2
 */
public class Example2 {

    public static void main(String[] args) {
        Cat d = new Cat();
        d.eat();
        myDog.main(args);
        Application.main(args);
    }
}
/**
 * Animal
 */ 
class Animal {
    protected int legs;
    protected String sounds;
    public void eat(){
        System.out.println("Animal eats.\nThis animal has " + legs+" legs");
    }
    public void sound(){
        System.out.println("Animal sounds: "+sounds);
    }
    public void soundSetter(String sounds){
        this.sounds = sounds;
    }
    
}

/**
 * Cat extends Animal
 */
class Cat extends Animal {
    Cat(){
        legs = 4;
    }
}

class Dogs extends Animal {
    Dogs(String sounds){
        legs = 4;
        soundSetter(sounds);
    }
}

class myDog {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Wharf");
        dog1.sound();
        Dogs dog2 = new Dogs("Purrr");
        dog2.sound();
    }

}

class Application{
    public static void main(String[] args) {
        cls2 obj = new cls2();
    }

}

class cls2 extends cls1{
    public cls2(){
        System.out.println("New cls2");
    
    }
}

class cls1{
    public cls1(){
        System.out.println("New cls1");
    }
}

