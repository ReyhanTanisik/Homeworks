package day17_tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want reserve a room?");
        String answer = scan.next().toLowerCase();


       if (answer.equals("yes")) {
            System.out.println("Which type of room do you want to reserve?");
            scan.nextLine();
            String typeOfRoom = scan.nextLine().toLowerCase();

            if (typeOfRoom.equals("king bed")) {
                System.out.println("King bed  120$");

            }
            if (typeOfRoom.equals("queen bed")) {
                System.out.println("Queen bed : 100 $");
            }
            if (typeOfRoom.equals("single bed")) {
                System.out.println("Single bed : 80 $");


            }
            while (!(typeOfRoom.equals("king bed") || typeOfRoom.equals("queen bed") || typeOfRoom.equals("single bed"))) {
                System.out.println("Please re-enter a valid room:");
                typeOfRoom=scan.nextLine().toLowerCase();

            }
            if (typeOfRoom.equals("king bed")) {
                System.out.println("King bed  120$");

            }
            if (typeOfRoom.equals("queen bed")) {
                System.out.println("Queen bed : 100 $");
            }
            if (typeOfRoom.equals("single bed")) {
                System.out.println("Single bed : 80 $");


            }


        } else if (answer.equals("no")) {
             System.out.println("Have a nice day!");
        } else {
           System.out.println("Please re -enter a valid entry");
           answer = scan.next().toLowerCase();
           while (!(answer.equals("yes") || answer.equals("no"))) {
               System.out.println("Please re-enter a valid entry");
               answer = scan.next();
           }
       }
           if (answer.equals("yes")) {
               System.out.println("Which type of room do you want to reserve?");
               scan.nextLine();
               String typeOfRoom = scan.nextLine().toLowerCase();

               if (typeOfRoom.equals("king bed")) {
                   System.out.println("King bed  120$");

               }
               if (typeOfRoom.equals("queen bed")) {
                   System.out.println("Queen bed : 100 $");
               }
               if (typeOfRoom.equals("single bed")) {
                   System.out.println("Single bed : 80 $");


               }
               while (!(typeOfRoom.equals("king bed") || typeOfRoom.equals("queen bed") || typeOfRoom.equals("single bed"))) {
                   System.out.println("Please re-enter a valid room:");
                   typeOfRoom=scan.nextLine().toLowerCase();

               }
               if (typeOfRoom.equals("king bed")) {
                   System.out.println("King bed  120$");

               }
               if (typeOfRoom.equals("queen bed")) {
                   System.out.println("Queen bed : 100 $");
               }
               if (typeOfRoom.equals("single bed")) {
                   System.out.println("Single bed : 80 $");


               }


           } else if (answer.equals("no")) {
               System.out.println("Have a nice day!");






    }

}
     }