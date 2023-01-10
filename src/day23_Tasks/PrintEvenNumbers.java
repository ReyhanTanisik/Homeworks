package day23_Tasks;

public class PrintEvenNumbers {

    public static void printEvenNumbers(){
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
    }

    public static void main(String[] args) {
        printEvenNumbers();
    }
}
