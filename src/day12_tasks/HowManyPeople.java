package day12_tasks;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int num1 = scan.nextInt();
        if (num1>=1 && num1<3){
            System.out.println("Live  with less than " +num1 + " people.");
        }
        if (num1>=3&& num1 <6){
            System.out.println("Live with 7"+num1 +" people.");
        }
        if (num1>=6){
            System.out.println("Live with more than 6 people.");
        }
        scan.close();
    }
}
