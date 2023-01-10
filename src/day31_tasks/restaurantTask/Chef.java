package day31_tasks.restaurantTask;

public class Chef {

    //Create a class called Chef
    //            Attributes:
    //                name (String),
    //employeeID (int), hourlyRate (double), fullTime (boolean)

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    //   Add A constructor that can set all the
    //fields

    public Chef(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }


    //            Actions: (all void methods)
    //                makeOrder(): chef's
    //name + "is making an order"
    public void makeOrder(){
        System.out.println(name + " is making an order");
    }
    //                washDishes(): chef's
    //name + "is washing the dishes"

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }
    //                toString(): Returns
    //(String) all the information of a Chef

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }


    //                    -> Extra: For
    //fullTime status, instead of printing a boolean value, print "full-time" or
    //"part-time"
}
