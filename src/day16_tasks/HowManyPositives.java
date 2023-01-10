package day16_tasks;

import java.util.Scanner;

public class HowManyPositives {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int positiveNumbers=0;
        int negativeNumbers=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int number= scan.nextInt();
            if (number>0){
                positiveNumbers+=1;
            }else if (number==0){ //do not add anything to sum , because 0 isn'negative or positive
                positiveNumbers+=0;
                negativeNumbers+=0;
            }
            else{
                negativeNumbers+=1;
            }

        }
        System.out.println("positiveNumbers = " + positiveNumbers);
        System.out.println("negativeNumbers = " + negativeNumbers);


   scan.close();


    }
}
