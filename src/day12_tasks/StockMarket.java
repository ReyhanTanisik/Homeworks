package day12_tasks;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many total shares you have already?");
        int shares= scan.nextInt();
        if(shares>0){
            System.out.println("How much is your total value in the stock market?");
            double totalValue=scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter the name of the company that you have the  most shares in:");
            String company=scan.nextLine();

            System.out.println("Your total stock market holding is "+totalValue+"$"+" which is made up "+shares+" shares.\n"+company+" is your company holdings.");


        }else{
            System.out.println("Invalid number");
        }
        scan.close();

    }
}
