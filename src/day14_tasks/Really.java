package day14_tasks;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=scan.next();
        int length=s.length();
        String s1=s.substring(length-2);
        if(s1.equals("ly")){
            System.out.println("Really?");
        }else{
            System.out.println("Never Mind!");
        }
    }
}
