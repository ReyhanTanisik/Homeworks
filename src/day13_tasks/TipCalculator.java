package day13_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Split or no split? Yes or no?");
        String yesOrNo=scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numberOfPeople=scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount= scan.nextDouble();

        System.out.println("How was the service quality? Excellent ,Great , Good , Fair or Poor?");
        String quality= scan.next().toLowerCase();

       double tipRate=  (quality.equals("excellent"))? 0.25 :(quality.equals("great"))? 0.20 :(quality.equals("good"))? 0.15 :( quality.equals("fair"))?0.10
               :0.05;
       double totalTip= amount* tipRate;

       if(yesOrNo.equals("yes")){
           double amountPerPerson= amount /numberOfPeople;
           double tipPerPerson=totalTip /numberOfPeople;

           System.out.println("Number of people entered: "+numberOfPeople);
           System.out.println("Total to pay: "+ amount);
           System.out.println("Total tip: "+totalTip);
           System.out.println("Total per person: "+ amountPerPerson);
           System.out.println("Tip per person: "+ tipPerPerson);
       }
       else{
           System.out.println("Number of people entered: "+numberOfPeople);
           System.out.println("Total to pay: "+ amount);
           System.out.println("Total tip: "+totalTip);
       }
       scan.close();



    }
}
