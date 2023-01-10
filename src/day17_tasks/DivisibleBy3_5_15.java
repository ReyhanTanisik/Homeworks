package day17_tasks;

import java.util.Scanner;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scan.nextInt();
        String divisibleBy15="";
        String divisibleBy3="";
        String divisibleBy5="";
        for (int i = 01; i <n ; i++) {
            if(i%3==0 && i%5==0 && i%15 ==0){
                divisibleBy15+=i+" ";
                }

                if( i%3==0 && i%15!=0){
                divisibleBy3+=i+" ";
            }
            if( i%5==0 && i%15!=0){
                divisibleBy5+=i+" ";


        }


    }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);

    }
}
