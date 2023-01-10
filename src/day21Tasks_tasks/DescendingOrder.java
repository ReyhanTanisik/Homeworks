package day21Tasks_tasks;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int [] arr={3,7,2,1,5,11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr2= new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            arr2[j++]=arr[i];


        }
        System.out.println(Arrays.toString(arr2));

    }
}
