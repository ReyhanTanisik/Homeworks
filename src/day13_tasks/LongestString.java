package day13_tasks;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two sentences:");
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        int lengthS1=s1.length();
        int lengthS2=s2.length();
         if(lengthS1>lengthS2){
             System.out.println(s1);
         }
         else{
             System.out.println(s2);
         }
         scan.close();


    }
}
