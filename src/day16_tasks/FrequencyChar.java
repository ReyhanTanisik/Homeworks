package day16_tasks;

import java.util.Scanner;

public class FrequencyChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= scan.nextLine();
        System.out.println("Enter a character:");
        String c= scan.next();
        int frequency=0;

        for (int i = 0; i < s.length() ; i++) {
        if (c.equals(s.charAt(i)+"")){
            frequency +=1;

        }

        }
        System.out.println(frequency);
        scan.close();
    }
}
