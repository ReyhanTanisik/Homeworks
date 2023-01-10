package day23_Tasks;

public class PrintEachChar {
    public static void printEachChar( String word){
        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));

        }
    }

    public static void main(String[] args) {
        printEachChar("elma");
    }


}
