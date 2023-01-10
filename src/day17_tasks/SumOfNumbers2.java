package day17_tasks;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scan.nextInt();
        int result = 0;

        while (num>=0){
            result += num;
            System.out.println("Sum of your numbers: "+result);
            System.out.println("Enter your number");
            num = scan.nextInt();
        }
        System.out.println("You entered a negative number");



    }
}
