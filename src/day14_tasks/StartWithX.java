package day14_tasks;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=scan.next();
        String firstCharacter=s.charAt(0)+"";
        if (firstCharacter.equals("x")){
            String s1=s.substring(1);
            System.out.println(s1);
        }
        else {
        System.out.println(s);

    }
        scan.close();
}
      }
