package day10_tasks;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number=50;
        int crew=0;
        int passenger=0;

        if (number==50 || number ==75 || number ==100){
            if (number==50){
                crew=20;
                passenger=30;
            }
            else if(number==75){
                crew=25;
                passenger=50;

            }
            else {
                crew=30;
                passenger=70;
            }

        }
        else{
            System.out.println("Invalid Number");

        }

        System.out.println("crew = " + crew);
        System.out.println("passenger = " + passenger);

    }
}
