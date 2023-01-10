package day13_tasks;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= scan.next();

        System.out.println("Enter your last name:");
        String lastName=scan.next();

        char initial1 =  firstName.charAt(0);
        char initial2= lastName.charAt(0);

        System.out.println(initial1+"."+initial2);
        scan.close();
    }
}
