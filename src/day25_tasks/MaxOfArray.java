package day25_tasks;

public class MaxOfArray {


    public static int maxOfArray ( int [] arr){
        int max= arr [0];
        for (int each : arr){
            if( each > max){
                max=each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr1={10,2,34,4,15};
        int m= maxOfArray(arr1);
        System.out.println(m);
    }
}
