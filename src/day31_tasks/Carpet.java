package day31_tasks;

public class Carpet {

    //5.1create a custom class for the Carpet class that should contain
    //the following:
    //instance variables:
    //width, length, unitPrice, isPersian (boolean)
    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian ;


    //Add a constructor to set all the instances
    //instance methods:

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    //calcCost(): should be able to calculate the total
    //cost of the carpet and return it as double

    public double calcCost(){
        double totalPrice=(width*length)*unitPrice;
        if (isPersian==true){
            totalPrice +=200;
        }
        return totalPrice;

    }
    //toString(): should be able to display all the info
    //of the carpet including the total cost of the carpet as calculated by
    //calcCost()
    //total price of carpet = (width*length)*unitprice
    //if the carpet is persian  carpet, add 200$ to the totalPrice


    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }
}
