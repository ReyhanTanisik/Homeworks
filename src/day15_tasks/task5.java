package day15_tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word =scan.next();
        String letters="";
        String digits="";
        String specialCharacters="";
        int length=word.length();
        for (int i = 0; i < length; i++) {
            if ((word.charAt(i)>='A' && word.charAt(i)<='Z')|| (word.charAt(i)>='a' && word.charAt(i) <='z') ){
                letters+=word.charAt(i);
            }
            else if (word.charAt(i)>='0' && word.charAt(i) <= '9' ){
                digits+=word.charAt(i);

            }else{
                specialCharacters += word.charAt(i);

            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);
        scan.close();
    }
}
