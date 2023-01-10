package day21Tasks_tasks;

import java.util.Arrays;

public class HowManyPalindrome {
    public static void main(String[] args) {
        String [] words={"anna", "level", "Java"};
        int count=0;
        String[] wordsReversed=new String[words.length];

        for (int i = 0; i< words.length; i++) {
            wordsReversed[i]="";

            for (int j =words[i].length()-1 ; j >=0; j--) {
                wordsReversed[i]+= words[i].charAt(j);

            }

            }

        for (int i = 0; i <words.length ; i++) {
            if ( wordsReversed[i].equals(words[i])){
                count++;
            }

        }
        System.out.println(count);

        }
    }

