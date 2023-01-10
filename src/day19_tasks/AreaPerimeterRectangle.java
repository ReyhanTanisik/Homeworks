package day19_tasks;

import java.util.Scanner;

public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double l = scan.nextDouble();

        if (l == 0 || l < 0) {
            System.err.println("Invalid entry for the length of the rectangle.");
            System.exit(0);
        }
        System.out.println("Enter the width of the rectangle:");
        double w = scan.nextDouble();

        if (w == 0 || w < 0) {
            System.err.println("Invalid entry for the width of the rectangle.");
            System.exit(0);

        }
        double area= w*l;
        double perimeter= (2*w) + (2*l);

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.println("Would you like to calculate another rectangle");
        String a= scan.next();

        while (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry please re-enter:");
            a= scan.next();

        }


        if(a.equalsIgnoreCase("yes")){

            System.out.println("Enter the length of the rectangle:");
             l = scan.nextDouble();

            if (l == 0 || l < 0) {
                System.err.println("Invalid entry for the length of the rectangle.");
                System.exit(0);
            }
            System.out.println("Enter the width of the rectangle:");
             w = scan.nextDouble();

            if (w == 0 || w < 0) {
                System.err.println("Invalid entry for the width of the rectangle.");
                System.exit(0);

            }
             area= w*l;
             perimeter= (2*w) + (2*l);

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);



        }

        if (a.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Rectangle Calculator App");
        }





  scan.close();

    }
}