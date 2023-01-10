package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiplyBy2EachOddNumber {
    public static void main(String[] args) {
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));

        for (Integer each : numbers){
            if (each%2==1){
                numbers.set(numbers.indexOf(each),each*2);

            }
        }
        System.out.println(numbers);


    }
}
