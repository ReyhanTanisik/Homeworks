package day24_tasks;

import java.util.Arrays;

public class RemoveElement {

    public static int [] removeElement ( int [] arr , int index){
        int [] result = new int[ arr.length-1];
        int j=0;
        for (int i = 0; i <arr.length ; i++) {
            if( i ==index){
                continue;
            }
            result[j++]= arr[i];

        }
        return result;
    }

    public static void main(String[] args) {
         int [] arr={1,2,3,4,5};
         int index= 2;
         int [] res=removeElement(arr,index);
        System.out.println(Arrays.toString(res));
    }

}
