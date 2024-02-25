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
    laptop(String brand, int price, String color,int ram, int storage,String processor,String os, boolean isGaming, boolean isTouchscreen, boolean isConvertible, boolean isDetachable, boolean isLightweight, boolean isPortable, boolean isBusiness,boolean isStudent, boolean isMultimedia){
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.os = os;
        this.isGaming = isGaming;
        this.isTouchscreen = isTouchscreen;
        this.isConvertible = isConvertible;
        this.isDetachable = isDetachable;
        this.isLightweight = isLightweight;
        this.isPortable = isPortable;
        this.isBusiness = isBusiness;
        this.isStudent = isStudent;
        this.isMultimedia = isMultimedia;
    }
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
        laptop Dell = new laptop("Dell", 500, "Black", 8, 256, "Intel Core i5", "Windows 10", false, false, false, false, false, true, true, false, true);
        laptop HP = new laptop("HP", 600, "Silver", 16, 512, "Intel Core i7", "Windows 10", true, true, true, false, true, true, true, true, true);
        laptop Lenovo = new laptop("Lenovo", 700, "Black", 16, 512, "Intel Core i7", "Windows 10", true, true, true, true, true, true, true, true, true);
        System.out.println("Brand: " + Dell.brand+" Price: "+Dell.price+" Color: "+Dell.color+" RAM: "+Dell.ram+" Storage: "+Dell.storage+" Processor: "+Dell.processor+" OS: "+Dell.os+" Gaming: "+Dell.isGaming+" Touchscreen: "+Dell.isTouchscreen+" Convertible: "+Dell.isConvertible+" Detachable: "+Dell.isDetachable+" Lightweight: "+Dell.isLightweight+" Portable: "+Dell.isPortable+" Business: "+Dell.isBusiness+" Student: "+Dell.isStudent+" Multimedia: "+Dell.isMultimedia);
        System.out.println("Brand: " + HP.brand+" Price: "+HP.price+" Color: "+HP.color+" RAM: "+HP.ram+" Storage: "+HP.storage+" Processor: "+HP.processor+" OS: "+HP.os+" Gaming: "+HP.isGaming+" Touchscreen: "+HP.isTouchscreen+" Convertible: "+HP.isConvertible+" Detachable: "+HP.isDetachable+" Lightweight: "+HP.isLightweight+" Portable: "+HP.isPortable+" Business: "+HP.isBusiness+" Student: "+HP.isStudent+" Multimedia: "+HP.isMultimedia);
        System.out.println("Brand: " + Lenovo.brand+" Price: "+Lenovo.price+" Color: "+Lenovo.color+" RAM: "+Lenovo.ram+" Storage: "+Lenovo.storage+" Processor: "+Lenovo.processor+" OS: "+Lenovo.os+" Gaming: "+Lenovo.isGaming+" Touchscreen: "+Lenovo.isTouchscreen+" Convertible: "+Lenovo.isConvertible+" Detachable: "+Lenovo.isDetachable+" Lightweight: "+Lenovo.isLightweight+" Portable: "+Lenovo.isPortable+" Business: "+Lenovo.isBusiness+" Student: "+Lenovo.isStudent+" Multimedia: "+Lenovo.isMultimedia);

    }
}