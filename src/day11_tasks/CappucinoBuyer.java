package day11_tasks;

public class CappucinoBuyer {
    public static void main(String[] args) {
        double price=0;
        int calories=0;
        String size = "tall";
        switch(size){
            case "tall":
                price=3.69;
                calories=90;
                break;
            case "grande":
                price=3.99;
                calories=120;
                break;
            case "venti":
                price=4.29;
                calories=150;
            default:
                System.out.println("Invalid size");
        }
        System.out.println("price = " + price + "$");
        System.out.println("calories = " + calories);
    }
}
