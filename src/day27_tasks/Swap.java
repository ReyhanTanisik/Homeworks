package day27_tasks;

import java.util.Arrays;

public class Swap {

    public static int[] swap(int[] arr, int k, int l) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {


            if (i == k) {
                result[k] = arr[l];

            } else if (i == l) {
                result[l] = arr[k];

            } else {
                result[i] = arr[i];


            }

        }

        return result;


        }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 0;
        int l = 4;

        int[] result = swap(arr, k, l);
        System.out.println(Arrays.toString(result));

    }
    }

