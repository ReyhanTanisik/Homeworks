package day12_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles= scan.nextDouble();
        double km= miles*1.60934;
        System.out.println(miles +" is equal to "+km +" kilometers");
        scan.close();
    }
}
