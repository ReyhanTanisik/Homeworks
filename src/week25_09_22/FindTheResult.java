package week25_09_22;

public class FindTheResult {
    public static void main(String[] args) {
        int a =15;
        if(a%3==0){
           a+=20;
        }
        if (a%5==0){
            a+=25;
        }
        if (a%15==0){
            a+=50;
        }else{
            System.out.println("The number isn't divisible by 3,5 and 15.");
        }
        System.out.println(a);
    }
}
