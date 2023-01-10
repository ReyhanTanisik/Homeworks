package day18_tasks;

import java.util.Scanner;

public class RoomReservation2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Which bedroom do you want to reserve?");
        String room= scan.nextLine().toLowerCase();

        System.out.println("How many nights you will stay?");
        int d= scan.nextInt();


        System.out.println("Would you like to reserve another room?");
        String a= scan.next().toLowerCase();
        scan.nextLine();

        int totalPrice=0;
        int totalPrice2=0;



        while(a.equals("yes")){

            System.out.println("Which bedroom do you want to reserve?");
             room= scan.nextLine();

            System.out.println("How many nights you will stay?");
             d= scan.nextInt();
             scan.nextLine();
             if(room.equalsIgnoreCase("king bed")) {
                 totalPrice += d * 120;
             }
                if(  room.equalsIgnoreCase("queen bed")){
                totalPrice += d * 100;
            }
                if(room.equalsIgnoreCase("single bed")){
                    totalPrice += d * 80;

            }
               totalPrice2+= totalPrice;

             System.out.println("Would you like to reserve another room?");
             a= scan.next().toLowerCase();
             scan.nextLine();
             while(!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.out.println("Enter a valid entry");
                a= scan.next().toLowerCase();
            }


            if (a.equals("no")){

                System.out.println(totalPrice2);
                break;

            }

        }
        scan.close();
    }
}
