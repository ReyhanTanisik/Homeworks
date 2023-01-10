package day13_tasks;

import java.util.Scanner;

public class FirstLastSame {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();
        char firstCharacter= word.charAt(0);
        char lastCharacter=word.charAt( word.length()-1);
        if(firstCharacter==lastCharacter){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        scan.close();

    }
}
