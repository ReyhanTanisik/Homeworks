package replits;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int l = str.length();
        int triple=0;
        for (int i = 0; i <= 3; i++) {

            if( (str.charAt(i) == str.charAt(i+1)) && (str.charAt(i)==str.charAt(i+2))){
                str = str.substring(str.charAt(i+2));
                triple +=1;
            }

        }
        System.out.println(triple);
        scan.close();

    }
}
