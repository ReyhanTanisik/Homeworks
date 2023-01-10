package day13_tasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a three letter word:");
        String s =scan.next();
        int totalCharacter=s.length();
        if(totalCharacter==3){
            char middleCharacter=s.charAt(1);
            if(middleCharacter=='a'){
                System.out.println("Cool word!");
            }else{
                System.out.println("Okay word!");
            }
        }else if (totalCharacter<3){
            System.out.println("Word is too short");
        }else{
            System.out.println("word is too long");
        }
    }
}
