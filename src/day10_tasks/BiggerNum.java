package day10_tasks;

public class BiggerNum {
    public static void main(String[] args) {
        int n1=40;
        int n2=45;
        int n3=32;
       String result= (n1>n2 && n1>n3)? n1 +" is bigger." :(n2>n1 && n2>n3)? n2 + " is bigger." : (n3>n1 && n3 > n2)? n3 +" is bigger ."
        : "They are equal.";
        System.out.println("result = " + result);
    }
}
