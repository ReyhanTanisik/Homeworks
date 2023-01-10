package day25_tasks;

public class MinOfArray {

    public static int minOfArray ( int [] arr){
        int min = arr[0];
        for( int each : arr){
            if( each < min){
                min=each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr= {10,2,3,1,5};
        int m= minOfArray(arr);
        System.out.println(m);
    }
}
