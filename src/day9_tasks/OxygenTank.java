package day9_tasks;

public class OxygenTank {
    public static void main(String[] args) {
        int number=50;
        String result="";
        if (number>=90){
            result="Your tank is full.";

        }
        else if (number<=90 && number>=80){
            result="Still okay.";
        }
        else if (number<=80 && number>=70){
            result="Don't go too far";
        }
        else if(number >=70 && number >=60){
            result="Start to head back";

        }else{
            result="Be careful , now you at %50";
        }

        System.out.println("result = " + result);
    }
}
