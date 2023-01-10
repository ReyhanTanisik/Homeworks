package day24_tasks;

public class FrequencyOfElement {

    public static int frequencyOfElement ( int [] arr, int a){
        int frequencyOfElement =0;
        for( int each : arr){

            if ( a== each){
                frequencyOfElement++ ;
            }
        }
        return frequencyOfElement;
    }


    public static void main(String[] args) {
        int [] arr2= {1,2,3,3,4,5,3};
        int b= frequencyOfElement(arr2,3);
        System.out.println(b);

    }
}
