package day31_tasks;

public class Address {


    public String buildingNumber, street,city,state,zipCode;

    public Address(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }


    //2.1 Create a class named Address
    //    Attributes:
    //   buildingNumber, street, city, state,
    //zipCode;
    //   Add a constructor to set all the fields
    //    Actions
    //            toString: returns the address
    //                        EX:
    //
    //7925 Jones Branch Dr
    //
    //McLean Va, 22012
}
