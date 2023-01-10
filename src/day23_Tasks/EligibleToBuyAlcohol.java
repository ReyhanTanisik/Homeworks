package day23_Tasks;

public class EligibleToBuyAlcohol {

    public static void eligibleToBuyAlcohol(int age){
        if (age>=0 && age<=120){
        if(age>=18){
            System.out.println("The person is eligible to buy alcohol");
        }else{
            System.out.println("The person is'nt eligible to buy alcohol");
        }


    }else{
            System.out.println("The age of the person is invalid.");
        }
}


    public static void main(String[] args) {
        eligibleToBuyAlcohol(134);
    }
    }
