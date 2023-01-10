package replits;

import java.util.Scanner;

public class withoutFirstLetter {



        public static void main(String[] args) {
            //DO NOT TOUCH THIS PART
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            //WRITE YOUR CODE HERE
            int l=word.length();
            String s1=word.substring(1);
            String s2=word.substring(0,l-1);
            System.out.println("without first letter: "+s1);
            System.out.println("without last letter: "+s2);

        }
         }