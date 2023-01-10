package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumberOfArrayList {


    public static void main(String[] args) {

        ArrayList <Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        int max= list.get(0);
        for ( Integer each : list){
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);

    }
}
