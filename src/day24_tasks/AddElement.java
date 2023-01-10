package day24_tasks;

import java.util.Arrays;

public class AddElement {

    public static int [] addElement ( int [] arr , int b){
        int [] result = new int [ arr.length +1];
        for (int i = 0; i <arr.length ; i++) {
            result [ i ]= arr[i];
            result [ arr.length]= b;

        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr2={1,2,3,9,0};
        int b=10;
         int [] r= addElement(arr2,b);
        System.out.println(Arrays.toString(r));
    }
}
