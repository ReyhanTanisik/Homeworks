package day18_tasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner( System.in);


        System.out.println("Enter the first number:");
        int num1= scan.nextInt();

        System.out.println("Enter a math operator");
        String o= scan.next();



        while(  !(o.equals("+")|| o.equals("-")|| o.equals("*")|| o.equals("/"))){
            System.out.println("Enter a valid math operator");
            o= scan.next();
        }


        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();


        if (o.equals("+")){
            System.out.println(num1+num2);
        }else if( o.equals("-")){
            System.out.println(num1-num2);
        }else if( o.equals("*")){
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);
        }

        System.out.println("Do you want to continue?");
        String a = scan.next();

        while(!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
            System.out.println("Please enter a valid entry");
            a= scan.next();
        }

        while( a.equalsIgnoreCase("yes")){

            System.out.println("Enter the first number:");
             num1= scan.nextInt();

            System.out.println("Enter a math operator");
             o= scan.next();



            while(  !(o.equals("+")|| o.equals("-")|| o.equals("*")|| o.equals("/"))){
                System.out.println("Enter a valid math operator");
                o= scan.next();
            }


            System.out.println("Enter the second number:");
            num2 = scan.nextInt();


            if (o.equals("+")){
                System.out.println(num1+num2);
            }else if( o.equals("-")){
                System.out.println(num1-num2);
            }else if( o.equals("*")){
                System.out.println(num1*num2);
            }else{
                System.out.println(num1/num2);
            }

            System.out.println("Do you want to continue?");
             a = scan.next();

            while(!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.out.println("Please enter a valid entry");
                a= scan.next();
            }




            if(a.equalsIgnoreCase("no")){
            System.out.println("Thanks for using Cydeo Calculator");
            break;
        }



        }
        scan.close();

    }
}
