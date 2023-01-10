package day33_tasks;

public class Adress {

    public String street,city,state,zipCode;
    public int buildingNumber;
    public static  String country="Usa", planet="Earth";

    public Adress(String street, String city, String state, String zipCode, int buildingNumber) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", buildingNumber=" + buildingNumber +
                '}';
    }

    /*
    Address Task:
1. Create a class named Address:
    Attributes:
        instance:  street, city, state, zipCode;
        static: country, planet
        Add a constructor that can set All the fields
(instances)
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:

7925 Jones Branch Dr

McLean Va, 22012
     */
}
