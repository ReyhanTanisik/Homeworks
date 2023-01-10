package day21Tasks_tasks;

import java.util.Arrays;

public class Merge3Arrays {
    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = arr1[i];

        }



        int j = 0;
        for (int i = arr1.length; i < arr2.length + arr1.length; i++) {
            arr4[i] = arr2[j++];

        }

        int k=0;
        for (int i = arr1.length+ arr2.length; i <arr4.length; i++) {
            arr4[i]=arr3[k++];

        }
        System.out.println(Arrays.toString(arr4));

    }
}
