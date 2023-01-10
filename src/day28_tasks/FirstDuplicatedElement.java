package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {

    public static void main(String[] args) {
        ArrayList <Integer> list=  new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        int firstDuplicatedElement=list.get(0);

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)==list.get(i+1)){
                  firstDuplicatedElement=list.get(i+1);
                break;
            }

        }
        System.out.println(firstDuplicatedElement);


    }
}
