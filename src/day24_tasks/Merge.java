package day24_tasks;

import java.util.Arrays;

public class Merge {

    public static int [] merge2arrays ( int [] arr1 , int [] arr2){
        int [] result = new int[ arr1.length + arr2.length];

       int i = 0;
       for ( int each : arr1){
           result[ i++] = each;
       }
       for ( int each : arr2 ){
           result[ i++]= each ;
       }

        return result;
    }

    public static void main(String[] args) {
        int [] arr1= {1,2,3,4};
        int [] arr2= {5,6,7,8};
        int [] arr3=merge2arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }



}
