package week25_09_22;

public class SalaryAfterTax2 {
    public static void main(String[] args) {
        double salary = 70050;
        boolean married = true;
        double taxRate=0;

         if (salary<=80000){
             taxRate=0.2;
         }
         else if (salary<=100000){
             taxRate=0.25;
         }
         else if (salary<=130000){
              taxRate=0.3;
         }
         else{
              taxRate=0.35;

              if (married){
                  taxRate-=0.05;
              }



            }
         double salaryAfterTax= salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
