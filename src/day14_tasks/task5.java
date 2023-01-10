package day14_tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s= scan.next();
        char firstCharacter=s.charAt(0);
        if(firstCharacter>=48 && firstCharacter<=57){
            System.out.println("first character is a digit");
        }
        else if (firstCharacter>=65 && firstCharacter<=90){
            System.out.println("First character is an uppercase letter.");
        }
        else if(firstCharacter>=97 && firstCharacter<=122){
            System.out.println("First character is a lowercase letter.");
        }
        else{
            System.out.println("First character is a special character");
        }
        scan.close();

    }
}
