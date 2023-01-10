package day9_tasks;

public class FinRa {
    public static void main(String[] args) {
        int number=15;
        String result="";

        if (number%5==0 && number % 3==0){
            result="FINRA";
        }
        else if (number %3==0){
            result="FIN";
        }
         else if (number%5==0){
            result="RA";
        }else{
            System.out.println("The number isn't divisible by 3 and 5.");
        }
        System.out.println("result = " + result);



    }
}
