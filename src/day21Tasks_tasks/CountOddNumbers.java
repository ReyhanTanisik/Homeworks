package day21Tasks_tasks;

public class CountOddNumbers {
    public static void main(String[] args) {
        int [] arr={11,32,114,19,45,84};
        int countOdd=0;
        int countEven=0;
        for (int each : arr){
            if (each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println(countOdd);
        System.out.println(countEven);
    }
}
