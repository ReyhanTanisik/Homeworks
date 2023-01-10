package day13_tasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word with 5 character:");
        String s=scan.next();
        int length=s.length();

        if (length==5){
        String s1=    s.replaceFirst( s.charAt(0)+"" , s.charAt(4)+"");
        String s2= s1.replaceFirst( s1.charAt(1)+"",s.charAt(3)+"");
        String s3= s2.replaceFirst(s2.charAt(3)+"",s.charAt(1)+"");


            System.out.println(s3);

        } else if( length<5){
            System.out.println("The word is too short");
        }else{
            System.out.println("The word is too long");
        }
    }
}
