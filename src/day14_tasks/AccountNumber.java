package day14_tasks;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an account number :");
        String accountNumber= scan.next();
        char firstCharacter=accountNumber.charAt(0);
        int length=accountNumber.length();
        if (firstCharacter=='2'&& length==7){
            System.out.println("valid account number");

        }else if (firstCharacter=='5'&& length==10){
            System.out.println("valid account number");
        }else{
            System.out.println("Invalid account number");
        }
        scan.close();
    }
}
