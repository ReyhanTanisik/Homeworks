package day13_tasks;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three word:");
        String word1=scan.next();
        String word2=scan.next();
        String word3=scan.next();

        int length1=word1.length();
        int length2=word2.length();
        int length3=word3.length();

        if (length1==length2 && length2==length3){
            System.out.println("All words are same length");
        }
        else if (length1==length2 || length2==length3 || length1== length3){
            System.out.println("Not same nor different lengths");
        }
        else{
            System.out.println("All different lengths");
        }
        scan.close();
    }
}
