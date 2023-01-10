package day21Tasks_tasks;

public class CommonElements {
    public static void main(String[] args) {
        int [] arr1={ 1,2,3,4,5};

        int [] arr2={4,5,6,7,8};
        String commonElements="";
        for (int j = 0; j <arr2.length ; j++) {

            for (int i = 0; i <arr1.length ; i++) {
                if( arr2[j]==arr1[i]){
                    commonElements+=+arr1[i]+" ";
                }


            }


        }

        System.out.println(commonElements);
    }
}
