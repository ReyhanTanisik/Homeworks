package day19_tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int s = scan.nextInt();
        if (!(s >= 0 && s <= 100)) {
            System.out.println("Invalid score.");
            System.exit(0);
        }

        if(s>=90){
            System.out.println("A");
        } else if( s>=80){
            System.out.println("B");
        }else if( s>=70){
            System.out.println("C");
        }else if (s>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

        System.out.println("Would you like to continue?");
        String a= scan.next();

        while( !(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer , please re-enter:");
            a= scan.next();
        }

        if (a.equalsIgnoreCase("yes")){

            System.out.println("Enter your score:");
             s = scan.nextInt();
            if (!(s >= 0 && s <= 100)) {
                System.out.println("Invalid score.");
                System.exit(0);
            }

            if(s>=90){
                System.out.println("A");
            } else if( s>=80){
                System.out.println("B");
            }else if( s>=70){
                System.out.println("C");
            }else if (s>=60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }



        }

        if (a.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Grade Calculator App");
        }
    scan.close();

    }
}