package day17_tasks;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int num1=200;
        int num2=10;
        int div=0;

        for (int i = num1; i >= num2 ; ) {
                 i -= 10;
                 div +=1;



        }
        System.out.println(div);

    }
}
