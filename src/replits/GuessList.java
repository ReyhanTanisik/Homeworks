package replits;

import java.util.Scanner;

public class GuessList {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String guestliste="";
        System.out.println("Please enter the guest's name:");
        String name1=input.next();
        System.out.println("Do you want to enter another guest's name:");
        String answer=input.next().toLowerCase();

        while( answer.equals("yes")){
            System.out.println("Please enter the guest's name");
            String name =input.next();
            guestliste +=", "+name;
            System.out.println("Do you want to enter another guest's name:");
            answer=input.next().toLowerCase();

        }


           System.out.println("Guest's list: "+name1 + guestliste);
        }
    }


