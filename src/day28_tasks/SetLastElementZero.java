package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SetLastElementZero {

    public static void main(String[] args) {
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        numbers.set(numbers.size()-1,0); // set method replace it with the given index and with given element

        System.out.println(numbers);


    }




}
