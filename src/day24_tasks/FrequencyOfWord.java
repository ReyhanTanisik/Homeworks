package day24_tasks;

import java.util.Arrays;

public class FrequencyOfWord {
    public static int frequencyOfWords( String sentence , String word) {
        int frequency=0;

        String []  words=sentence.split(" ");

        for (String each : words){
            if( each.equals(word)){
                frequency++;
            }
        }
        return frequency;


    }


    public static void main(String[] args) {
       int a=  frequencyOfWords("love love love","love");
        System.out.println(a);


    }
}
