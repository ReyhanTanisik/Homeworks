package day16_tasks;

import java.util.Scanner;

public class WithoutMultiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two positive numbers:");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int multiplication=0;
        if (n1>0 && n2>0){
        for (int i = 0; i <n2 ; i++) {
            multiplication+=n1;

            
        }
    }else{
            System.out.println("Invalid");
        }
        System.out.println(multiplication);
        scan.close();
}
     }
