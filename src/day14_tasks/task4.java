package day14_tasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two words");
        String s1=scan.next();
        String s2=scan.next();
        int length=s1.length();
        String lastLetter=s1.charAt(length-1)+"";

        String firstLetter=s2.charAt(0)+"";
        if(lastLetter.equals(firstLetter)){
            String s3=s2.substring(1);
            String result=s1+s3;
            System.out.println(result);
        }
        scan.close();

    }
}
