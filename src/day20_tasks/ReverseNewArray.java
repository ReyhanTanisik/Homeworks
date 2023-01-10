package day20_tasks;

import java.util.Arrays;

public class ReverseNewArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] reversedArr= new int[arr.length];
        for (int i = arr.length-1,j=0; i >=0 ; i--,j++) {
            reversedArr[i]= arr[j];

        }
        System.out.println(Arrays.toString(reversedArr));

    }
}
