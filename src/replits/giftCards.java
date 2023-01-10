package replits;

import java.util.Scanner;

public class giftCards {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item=scan.next();

        switch(item){
            case "Blanket":
                System.out.println("Thank you for your purchase!\nYour current balance is: 60$");
                break;


            case "Charger":
                System.out.println("Thank you for your purchase!\nYour current balance is: 5$");
                break;

            case "Hat":
                System.out.println("Thank you for your purchase!\nYour current balance is: 25$");
                break;

            case "Headphones":
                System.out.println("Thank you for your purchase!\nYour current balance is: 30$");
                break;

            case "Laptop":
                System.out.println("Sorry not enough funds in your gift card");
                break;

            case "Pants":
                System.out.println("Thank you for your purchase!\nYour current balance is: 50$");
                break;

            case "Pillow":
                System.out.println("Thank you for your purchase!\nYour current balance is: 40$");
                break;

            case "Smartphone":
                System.out.println("Sorry not enough funds in your gift card");
                break;

            case "Socks":
                System.out.println("Thank you for your purchase!\nYour current balance is: 5$");
                break;

            case "USB Cable":
                System.out.println("Thank you for your purchase!\nYour current balance is: 10$");
                break;

            default:
                System.out.println("Sorry that is an invalid item");
                break;






        }


    }
}


