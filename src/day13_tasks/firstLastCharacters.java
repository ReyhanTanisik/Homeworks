package day13_tasks;

import java.util.Scanner;

public class firstLastCharacters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=scan.nextLine();
        char firstCharacter=s.charAt(0);
        char lastCharacter= s.charAt( s.length()-1); // be careful here!

        System.out.println(firstCharacter);
        System.out.println(lastCharacter);

        scan.close();
    }
}
