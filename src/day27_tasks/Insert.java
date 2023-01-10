package day27_tasks;

import java.util.Arrays;

public class Insert {

    public static int [] insert ( int [] arr, int index ,int element){

        if( index<=0 || index>=arr.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        int [] result= new int[ arr.length+1];


        result[index] = element;

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = arr[i];
        }

        return result;
    }






    public static void main(String[] args) {
        int [] arr={ 1,2,3,4,5};
        int index=4;
        int element=100;
        int [] result=insert( arr,index,element);
        System.out.println(Arrays.toString(result));
    }
}
