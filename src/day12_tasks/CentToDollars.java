package day12_tasks;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents:");
        int inputCents=scan.nextInt();

        int dollars= inputCents/100;
        int cents= inputCents%100;

        System.out.println(inputCents+" is equal to: " +dollars +" dollars and "+cents+" cents.");
    }
}
