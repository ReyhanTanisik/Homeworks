package day33_tasks;

public class Iphone {

    public String model;
    public double price;
    public String color,size;
    public static String brand="Apple";
    public static String os="iOS";
    public static String madeIn="China";

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model +" is faceTiming with " +phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model +" is face timing with "+email);
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber +" is texting");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    /*
    IPhone Task:
1. Create a class named IPhone:
Attributes:
instance: model, price,
color, size
statics: brand, OS, madeIn
Add a constructor that can set All the
fields (instances)
Actions:
faceTime(long phoneNumber)
faceTime(String email)
call(long phoneNumber)
text(long phoneNumber)
toString()
     */
}
