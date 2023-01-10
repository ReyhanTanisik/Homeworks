package day25_tasks;

import java.util.Arrays;

public class ReverseArray {

    public static int [] reverseArray ( int [] arr){
        int [] reversed= new int[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++]= arr[i];

        }
        return reversed;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] reversed= reverseArray(arr);
        System.out.println(Arrays.toString(reversed));
    }
}
