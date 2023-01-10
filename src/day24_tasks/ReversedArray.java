package day24_tasks;

import java.util.Arrays;

public class ReversedArray {


     public static int [] reversedArray ( int [] arr){
         int [] result = new int[ arr.length];
         int j=0;
         for (int i = arr.length - 1; i >= 0; i--) {
             result[j++]= arr [i];

         }
         return result;
     }


    public static void main(String[] args) {
        int [] arr2= {10,20,30,40,50};
        int [] result=reversedArray(arr2);
        System.out.println(Arrays.toString(result));
    }
}
