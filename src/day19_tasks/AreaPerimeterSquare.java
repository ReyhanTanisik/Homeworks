package day19_tasks;

import java.util.Scanner;

public class AreaPerimeterSquare {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double side= scan.nextDouble();

        if(side<0 || side==0){
            System.out.println("Invalid entry for the side of square");
            System.exit(0);
        }

        double area= side*side;
        double perimeter= 4*side;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.println("Would you like to enter another square");
        String a= scan.next();


        while(! (a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter");
            a= scan.next();
        }


        if (a.equalsIgnoreCase("yes")){
            System.out.println("Enter the side of the square");
            side= scan.nextDouble();

            if(side<0 || side==0){
                System.out.println("Invalid entry for the side of square");
                System.exit(0);
            }

             area= side*side;
            perimeter= 4*side;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);





        }
        if (a.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Square Calculator App");
        }

        scan.close();




    }
}
