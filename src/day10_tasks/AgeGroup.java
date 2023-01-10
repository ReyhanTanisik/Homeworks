package day10_tasks;

public class AgeGroup {
    public static void main(String[] args) {
        int age=100;
        String ageGroup="";
        if (age>=0 && age<=150){
            if (age<21){
                ageGroup="Teenager";
            }
            else if (age>=21 && age<55){
                ageGroup="Adult";
            }
            else {
                ageGroup="Senior";
            }
        } else {
            System.out.println("Invalid");
        }
        System.out.println("ageGroup = " + ageGroup);

    }
}
