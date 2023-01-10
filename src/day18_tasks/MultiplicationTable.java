package day18_tasks;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            System.out.println();

            int m = 1;
            for (int i = 1; i <= 10; i++) {
                m = j * i;
                System.out.print(m + " ");
            }


        }
    }
}