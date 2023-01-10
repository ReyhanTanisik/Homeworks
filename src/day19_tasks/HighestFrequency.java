package day19_tasks;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String s=scan.next();
       String result="";
       int temp=0;

        for (int j = 0; j <s.length() ; j++) {

            int count=0;
            char ch=s.charAt(j);
            for (int i = 0; i <s.length(); i++) {
                char each=s.charAt(i);
                if(ch==each){
                    count++;

                }
                if (count>temp){
                    temp+=count;
                    result+=ch;

                    }
                }


            }
        char result1=result.charAt(0);

        System.out.println(temp);
        System.out.println(result1);
    }

}
