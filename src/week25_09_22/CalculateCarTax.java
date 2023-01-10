package week25_09_22;

public class CalculateCarTax {
    public static void main(String[] args) {
        double price =50000;
        if (price>20000&& price<39000){
            double taxRate =0.2;
            System.out.println(taxRate);
        }else if (price>40000&&price<59999){
            double taxRate1=0.3;
            System.out.println(taxRate1);
        }else if (price>60000&& price>80000){
            double taxRate2=0.4;
            System.out.println(taxRate2);
        }else{
            System.out.println("Invalid Price");
        }
    }
}
