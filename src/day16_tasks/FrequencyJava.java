package day16_tasks;

import java.util.Scanner;

public class FrequencyJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s =scan.nextLine();
        String j="Java";
        int frequency=0;

        for (int i = 0; i <s.length()-3; i++) { 

            if ( j.equals(s.substring(i,i+4))) {
           frequency += 1;

       }

    }
        System.out.println(frequency);
        scan.close();
}
     }
