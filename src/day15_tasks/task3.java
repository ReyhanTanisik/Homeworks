package day15_tasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        int sum=0;
        for (int i = 0; i <num ; i++) {
            sum+=i;

        }
        System.out.println(sum);
        scan.close();
    }
}
