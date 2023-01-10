package day20_tasks;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 0, 1, 0};

        int[] arr2 = new int[arr.length];
          int j=0;


          for (int i = 0; i < arr.length; i++) {


             if (arr[i]!=0){
                arr2[j++]=arr[i];

            }

        }
        System.out.println(Arrays.toString(arr2));
        }

    }

