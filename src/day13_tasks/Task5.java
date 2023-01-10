package day13_tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=scan.next();
        int length=s.length();

        if (length==0){
            System.out.println("String is empty");
        }
        else if(length>3){
            char last3= s.charAt(length-1);
            char last2=s.charAt(length-2);
            char last1=s.charAt(length-3);
            System.out.println(last1+","+last2+","+last3);
        }else{
            System.out.println(s);
        }
        scan.close();
    }
}
