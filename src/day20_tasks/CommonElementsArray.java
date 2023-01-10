package day20_tasks;

public class CommonElementsArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={4,5,6,7,8};
        String element="";

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    element+=arr1[i]+" ";

                }

            }

        }
        System.out.println(element);


    }
}
