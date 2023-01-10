package day23_Tasks;

public class EligibleToVote {


    public static void eligibleToVote( int age , String citizenShip){
        if( age>=18 && citizenShip.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote.");
        } else{
            System.out.println("You are not eligible to vote.");
        }

    }

    public static void main(String[] args) {
        eligibleToVote(23,"english");
    }
}
