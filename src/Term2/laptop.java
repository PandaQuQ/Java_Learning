public class laptop {
    String brand;
    int price; 
    String color;
    int ram;
    int storage;
    String processor;
    String os;
    boolean isGaming;
    boolean isTouchscreen;
    boolean isConvertible;
    boolean isDetachable;
    boolean isLightweight;
    boolean isPortable;
    boolean isBusiness;
    boolean isStudent;
    boolean isMultimedia;
    boolean isGaming(Boolean A){
        if(A == false){
            this.isGaming = false;
        }else if (A == true) {
            this.isGaming = true;
        }
        return isGaming;
    }
    boolean isTouchscreen(Boolean A){
        if(A == false){
            this.isTouchscreen = false;
        }else if (A == true) {
            this.isTouchscreen = true;
        }
        return isTouchscreen;
    }
    boolean isConvertible(Boolean A){
        if(A == false){
            this.isConvertible = false;
        }else if (A == true) {
            this.isConvertible = true;
        }
        return isConvertible;
    }
    boolean isDetachable(Boolean A){
        if(A == false){
            this.isDetachable = false;
        }else if (A == true) {
            this.isDetachable = true;
        }
        return isDetachable;
    }
    boolean isLightweight(Boolean A){
        if(A == false){
            this.isLightweight = false;
        }else if (A == true) {
            this.isLightweight = true;
        }
        return isLightweight;
    }
    boolean isPortable(Boolean A){
        if(A == false){
            this.isPortable = false;
        }else if (A == true) {
            this.isPortable = true;
        }
        return isPortable;
    }
    boolean isBusiness(Boolean A){
        if(A == false){
            this.isBusiness = false;
        }else if (A == true) {
            this.isBusiness = true;
        }
        return isBusiness;
    }
    boolean isStudent(Boolean A){
        if(A == false){
            this.isStudent = false;
        }else if (A == true) {
            this.isStudent = true;
        }
        return isStudent;
    }
    boolean isMultimedia(Boolean A){
        if(A == false){
            this.isMultimedia = false;
        }else if (A == true) {
            this.isMultimedia = true;
        }
        return isMultimedia;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    void setPrice(int price){
        this.price = price;
    }
    void setColor(String color){
        this.color = color;
    }
    void setRam(int ram){
        this.ram = ram;
    }
    void setStorage(int storage){
        this.storage = storage;
    }
    void setProcessor(String processor){
        this.processor = processor;
    }
    void setOs(String os){
        this.os = os;
    }
    String getBrand(){
        return brand;
    }
    int getPrice(){
        return price;
    }
    String getColor(){
        return color;
    }
    int getRam(){
        return ram;
    }
    int getStorage(){
        return storage;
    }
    String getProcessor(){
        return processor;
    }
    String getOs(){
        return os;
    }

    public static void main(String[] args) {
        laptop laptop1 = new laptop();
        laptop1.setBrand("Dell");
        laptop1.setPrice(500);
        laptop1.setColor("Black");
        laptop1.setRam(8);
        laptop1.setStorage(256);
        laptop1.setProcessor("Intel Core i5");
        laptop1.setOs("Windows 10");
        laptop1.isGaming(false);
        laptop1.isTouchscreen(false);
        laptop1.isConvertible(false);
        laptop1.isDetachable(false);
        laptop1.isLightweight(false);
        laptop1.isPortable(true);
        laptop1.isBusiness(true);
        laptop1.isStudent(false);
        laptop1.isMultimedia(true);
        System.out.println("Brand: " + laptop1.getBrand());
        System.out.println("Price: " + laptop1.getPrice());
        System.out.println("Color: " + laptop1.getColor());
        System.out.println("RAM: " + laptop1.getRam());
        System.out.println("Storage: " + laptop1.getStorage());
        System.out.println("Processor: " + laptop1.getProcessor());
        System.out.println("OS: " + laptop1.getOs());
        System.out.println("Gaming: " + laptop1.isGaming);
        System.out.println("Touchscreen: " + laptop1.isTouchscreen);
        System.out.println("Convertible: " + laptop1.isConvertible);
        System.out.println("Detachable: " + laptop1.isDetachable);
        System.out.println("Lightweight: " + laptop1.isLightweight);
        System.out.println("Portable: " + laptop1.isPortable);
        System.out.println("Business: " + laptop1.isBusiness);
        System.out.println("Student: " + laptop1.isStudent);
        System.out.println("Multimedia: " + laptop1.isMultimedia);
    }
}
