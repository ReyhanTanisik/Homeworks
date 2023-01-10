package day31_tasks;

public class Item {

    //4.1 Create a class called Item
    //Attributes:
    //name, unitPrice, quantity

    public String name;
    public double unitPrice;
    public int quantity;
    //Add a constructor to initialize all the fields

    public Item(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }


    //Methods:
    //calcCost(): returns the total price of the Item

    public double calcCost(){
        return unitPrice*quantity;
    }
    //toString(): returns the name, unitPrice, quantity and total
    //Price that's calculated by calcCost()


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}
