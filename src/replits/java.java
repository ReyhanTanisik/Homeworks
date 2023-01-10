package replits;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:
        String j="java";
        if( j.equals(word.substring(0,4)) || j.equals(word.substring(1,5))) {
            System.out.println("true");


        }else{
            System.out.println("false");
        }


    }
}


