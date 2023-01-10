package day12_tasks;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int speedLimit=55;
        scan.close();
        System.out.println("Enter current speed:");
        int speed=scan.nextInt();
        if (speed> speedLimit){
            System.out.println("Slow Down!");


        }
    }
}
