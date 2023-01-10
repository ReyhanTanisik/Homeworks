package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MinNUmberOfArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,22,3,42,54,6));
        int min= list.get(0);
        for (Integer each : list){
            if (each<min){
                min=each;

            }

        }
        System.out.println(min);
    }
}
