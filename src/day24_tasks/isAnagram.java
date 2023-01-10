package day24_tasks;

import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram( String str1, String str2){
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return  Arrays.equals(char1,char2);
    }


    public static void main(String[] args) {
      boolean result=  isAnagram( "love","cba");
        System.out.println(result);

    }

    }


