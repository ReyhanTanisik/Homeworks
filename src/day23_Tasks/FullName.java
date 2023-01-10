package day23_Tasks;

public class FullName {


    public static void fullName( String firstName , String lastName){

        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toLowerCase()+ lastName.substring(1).toLowerCase();
        String fullName= firstName+" "+lastName;
        System.out.println(fullName);


    }
}
