package day17_tasks;

import java.util.Scanner;

public class ValidMathOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two number and one math operator:");
        int num1= scan.nextInt();
        int num2=scan.nextInt();
        String mathOperator=scan.next();
        if (mathOperator.equals("+") || mathOperator.equals("-") || mathOperator.equals("*") || mathOperator.equals("/")){
           if (mathOperator.equals("+")){
               int result=num1+num2;
               System.out.println(result);


           }else if (mathOperator.equals("-")){
               int result=num1-num2;
               System.out.println(result);


           }else if (mathOperator.equals("*")){
               int result=num1*num2;
               System.out.println(result);



        }else{
               int result=num1/num2;
               System.out.println(result);


           }

           }
        while( !(mathOperator.equals("+") || mathOperator.equals("-") || mathOperator.equals("*") || mathOperator.equals("/") )){
        System.out.println("Re-enter a valid operator");
        mathOperator=scan.next();


    }
        if (mathOperator.equals("+") || mathOperator.equals("-") || mathOperator.equals("*") || mathOperator.equals("/")){
            if (mathOperator.equals("+")){
                int result=num1+num2;
                System.out.println(result);


            }else if (mathOperator.equals("-")){
                int result=num1-num2;
                System.out.println(result);


            }else if (mathOperator.equals("*")){
                int result=num1*num2;
                System.out.println(result);



            }else{
                int result=num1/num2;
                System.out.println(result);


            }

        }



}
      }
