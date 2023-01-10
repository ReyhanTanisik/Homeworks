package day15_tasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();
        int sum=0;
        int length=word.length();
        for (int i = 0; i < length; i++) {
            if(word.charAt(i)>='0' && word.charAt(i)<='9'){
               int num=word.charAt(i)-48; //in this line we convert char to integer.because every char has a representative number.
               sum+=num;
            }


        }
        System.out.println(sum);
        scan.close();
    }
}
