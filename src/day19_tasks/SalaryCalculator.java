package day19_tasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        System.out.println("How much you make an hour?");
        double hourlyRate= scan.nextDouble();

        if (hourlyRate==0 || hourlyRate<0){
            System.out.println("Invalid entry for hourly rate");
            System.exit(0);
        }

        System.out.println("How many hour do you work per week?");
        double weeklyHour= scan.nextDouble();

        if (weeklyHour<=0 || weeklyHour>=144){
            System.out.println("Invalid entry for weekly hour");
        }

        System.out.println("Enter your state tax rate");
        double taxRate= scan.nextDouble();

        if (taxRate<=0 || taxRate>=0.10){
            System.out.println("Invalid entry for the tax rate");
            System.exit(0);
        }

        double grossSalary= weeklyHour*hourlyRate*52;
        double federalTax=0.26;
        double totalTax= federalTax+taxRate;
        double netIncome= grossSalary- grossSalary*totalTax;


        System.out.println("grossSalary = " + grossSalary);
        System.out.println("federalTax = " + federalTax);
        System.out.println("taxRate = " + taxRate);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        System.out.println("Would you like to continue?");
        String a= scan.next();

        while (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer please re-enter");
            a= scan.next();


        }

        if (a.equalsIgnoreCase("yes")){
            System.out.println("How much you make an hour?");
            hourlyRate= scan.nextDouble();

            if (hourlyRate==0 || hourlyRate<0){
                System.out.println("Invalid entry for hourly rate");
                System.exit(0);
            }

            System.out.println("How many hour do you work per week?");
             weeklyHour= scan.nextDouble();

            if (weeklyHour<=0 || weeklyHour>=144){
                System.out.println("Invalid entry for weekly hour");
            }

            System.out.println("Enter your state tax rate");
             taxRate= scan.nextDouble();

            if (taxRate<=0 || taxRate>=0.10){
                System.out.println("Invalid entry for the tax rate");
                System.exit(0);
            }

             grossSalary= weeklyHour*hourlyRate*52;
             federalTax=0.26;
             totalTax= federalTax+taxRate;
             netIncome= grossSalary- grossSalary*totalTax;


            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("taxRate = " + taxRate);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);





        }

        if (a.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Salary Calculator App");
        }

 scan.close();

    }
}
