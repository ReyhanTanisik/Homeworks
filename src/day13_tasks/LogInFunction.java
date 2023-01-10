package day13_tasks;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the username:");
        String userName=scan.next();

        System.out.println("enter the password");
        String passWord=scan.next();

        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            System.out.println("logged.in");
    } else {
            System.out.println("Incorrect username or password");
        }
        scan.close();
}
    }
