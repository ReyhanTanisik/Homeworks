package day19_tasks;

import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r= scan.nextDouble();

        if( r==0 || r<0){
            System.err.println("Invalid entry for the radius of the circle");
            System.exit(0);
        }
        double diameter= 2*r;
        double area= 3.14*r*r;
        double perimeter = 2*3.14*r;

        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.println("Would you like to calculate another circle");
        String a= scan.next();


        while( !(a.equalsIgnoreCase("yes")|| a.equals("no"))){
            System.out.println("Invalid answer , please re-enter");
            a= scan.next();
        }

        if(a.equalsIgnoreCase("yes")){

            System.out.println("Enter the radius of the circle");
             r= scan.nextDouble();

            if( r==0 || r<0){
                System.err.println("Invalid entry for the radius of the circle");
                System.exit(0);
            }
             diameter= 2*r;
             area= 3.14*r*r;
             perimeter = 2*3.14*r;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);


        }
        if(a.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Circle App");
        }

   scan.close();
    }
}
