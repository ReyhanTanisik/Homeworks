package day25_tasks;

import java.util.Arrays;

public class Merge2Array {

  public static int [] merge2array ( int [] arr1, int []  arr2){
      int [] result= new int[arr1.length+ arr2.length];
      int j=0;
      for (int each : arr1){
          result[j++]=each;
      }
      for (int each : arr2){
          result[j++]=each;
      }
      return result;
  }

    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2= {5,6,7,8};

        int [] result=merge2array(arr1,arr2);
        System.out.println(Arrays.toString(result));

    }
}
