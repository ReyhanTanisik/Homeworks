package replits;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        String rest= str.substring(str.indexOf("d"));


        if(str.contains("bread") && rest.contains("bread")) {
            String with = str.substring(str.indexOf("d")+1 , str.lastIndexOf("b"));
            System.out.println(with);

        }else{
            System.out.println("nothing");
        }
    }
}




