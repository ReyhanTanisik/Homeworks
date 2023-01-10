package replits;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int num=0;
        //WRITE YOUR CODE HERE:
        System.out.println("Day "+ num +"= ["+inhabitants+"]");

        for ( int i =1; i<=inhabitants *2  ; i++ ){
           num=i;
           inhabitants /=2;

        System.out.println("Day "+ num +"= ["+inhabitants+"]");



    }
        System.out.println("---- EXTINCT ----");
}

     }