package day15_tasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word:");
        String s= scan.next();
        String reverse="";
        int length=s.length();
        for (int i = length-1; i >=0 ; i--) {
            reverse += s.charAt(i);


        }
        System.out.println(reverse);
    }
}
