package day9_tasks;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber =5;
        String location= "";
        String teacher ="";
        int groupNumber=0;
        if (gradeNumber>=1 && gradeNumber<=6){
            if (gradeNumber==1){
                location="Apple Orchard";
                groupNumber=3;
                teacher= "Ms. Smith";
            }
            else if ( gradeNumber==2){
                location="Zoo";
                groupNumber=7;
                teacher= "Mr. Lee";

            }
            else if (gradeNumber==3){
                location="Aquarium";
                groupNumber= 5;
                teacher = "Mr.Wilson";

            }
            else if (gradeNumber==4){
                location= "Movie Theater";
                groupNumber=2;
                teacher=" Mr.Wilson";
            }
            else if (gradeNumber==5){
                location="Museum";
                groupNumber=5;
                teacher="Ms.Lela";
            }
            else{
                location="Six Flags";
                groupNumber=8;
                teacher="Mr.Watt";
            }

        }else{
            System.out.println("Invalid grade");
        }
        System.out.println("location = " + location);
        System.out.println("groupNumber = " + groupNumber);
        System.out.println("teacher = " + teacher);
    }
}
