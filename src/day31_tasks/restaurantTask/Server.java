package day31_tasks.restaurantTask;

public class Server {

    //        Attributes:
    //                name (String), employeeID (int),
    //hourlyRate (double), fullTime (boolean)
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    //Add A constructor that can set all the fields
    //        Actions: (all void methods)

    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }


    //            takeOrder(): server's name + "is taking an
    //order"

    public void takeOrder(){
        System.out.println(name + " is taking an order.");
    }
    //            cleanTable(): server's name + "is cleaning
    //the table"

    public void cleanTable(){
        System.out.println(name + " ia cleaning the table");
    }
    //            toString(): Returns (String) all the
    //information of a Server


    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
