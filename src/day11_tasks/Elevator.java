package day11_tasks;

public class Elevator {
    public static void main(String[] args) {
        int floorNum=1;
        String companies="";


            switch(floorNum){
                case 1:
                    companies="Lobby , Verizon, Starbucks.";
                    break;
                case 2:
                    companies="Cybertek , Nasa , Intelsat.";
                    break;
                case 3:
                    companies="Lyft , Bofa ,Stake house.";
                    break;
                default:
                    System.out.println("Invalid floor number.");
            }
        System.out.println(floorNum+ " is selected.");
        System.out.println("companies = " + companies);


    }
}
