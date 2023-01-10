package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArrays {

    public static void main(String[] args) {
        ArrayList <String> list1= new ArrayList<>();
        ArrayList <String> list2=new ArrayList<>();
        list1.addAll(Arrays.asList("A","B","C"));
        list2.addAll(Arrays.asList("E","F","G","H"));

        ArrayList <String > result= new ArrayList<>();
        for (int i = 0; i <list1.size() ; i++) {
            result.add(list1.get(i));

        }

        for (int j = 0; j <list2.size() ; j++) {
            result.add(list2.get(j));

        }
        System.out.println(result);
    }
}
