package replits;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Select screen size:");
        String screen=scan.next();
        double price=0;


        switch(screen){
            case "13.3" :
                price+=200;
                break;
            case "15.0":
                price+=300;
                break;
            case "17.3":
                price +=400;
                break;





        }
        System.out.println("Select CPU type:");
        String cpu =scan.next();

        switch(cpu){

            case "i3" :
                price+=150;
                break;
            case "i5":
                price+=250;
                break;
            case "i7":
                price +=350;
                break;


        }
        System.out.println("Select RAM size:");
        int ram= scan.nextInt();

        switch(ram){

            case 4 :
                price+=50;
                break;
            case 8:
                price+=100;
                break;
            case 16:
                price += 200;
                break;
            case 32 :
                price+=400;


        }

        System.out.println("Select storage type:");
        String storage=scan.next();

        switch(storage){

            case "HDD" :

                System.out.println("Select storage size:");
                int storageSize = scan.nextInt();
                int d=storageSize/500;
                if (storageSize%500==0) {
                    price+= d*50; }
                break;








            case "SDD":
                System.out.println("Select storage size:");
                int storageSize2 = scan.nextInt();
                int d2=storageSize2/500;
                if (storageSize2%500==0) {
                    price+= d2*100; }
                break;





        }

        System.out.println("Select screen resolution:");
        String resolution=scan.next();

        switch(resolution){
            case "FULLHD" :
                price+=100;
                break;
            case "4K":
                price+=200;
                break;




        }


        System.out.println("Final price is: $"+price);







    }
}

