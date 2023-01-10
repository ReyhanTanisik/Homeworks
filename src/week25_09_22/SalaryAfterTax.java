package week25_09_22;

public class SalaryAfterTax {
    public static void main(String[] args) {
        int salary=76788;
        boolean married=true;
        if (salary<80000&&!married){
            double taxRate= salary*0.2;
            System.out.println(salary-taxRate);
        }else if (salary>80000&& salary<100000&&!married){
            double taxRate1= salary*0.25;
            System.out.println(salary-taxRate1);
        }else if (salary>100000&& salary<130000&&!married){
            double taxRate2 =salary*0.3;
            System.out.println(salary-taxRate2);
        }else if (salary>130000&&!married){
            double taxRate3=salary*0.35;
            System.out.println(salary-taxRate3);
        }else if (salary<80000&&married){
            double taxRate4 =salary*0.15;
            System.out.println(salary -taxRate4);
        }else if (salary>80000 && salary<100000 && married){
            double taxRate5=salary*0.2;
            System.out.println(salary-taxRate5);
        }else if (salary>100000&& salary<130000&&married){
            double taxRate5= salary*0.25;
            System.out.println(salary-taxRate5);
        }else if (salary>130000&&married){
            double taxRate6=salary*0.3;
            System.out.println(salary-taxRate6);
        }else{
            System.out.println("Invalid number");
        }
    }
}
