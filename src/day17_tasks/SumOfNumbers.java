package day17_tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sum=0;


        for (int i = 0; i >= 0; i++) {  // infinite loop
            System.out.println("Enter a number:");
            int number=scan.nextInt();
            sum +=number;
            if (number<0){
                break;
            }

        }
        System.out.println(sum);


        }

    }

