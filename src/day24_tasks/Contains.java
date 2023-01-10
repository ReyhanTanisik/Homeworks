package day24_tasks;

public class Contains {

    public static boolean contains ( int [] arr , int a){
        boolean result = false;
        for( int each : arr){
            if(  a== each){
                result=true;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int b=0;
         boolean r=contains(arr,b);
        System.out.println(r);
    }
}
