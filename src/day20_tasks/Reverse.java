package day20_tasks;

public class Reverse {
    public static void main(String[] args) {


        String[] arr = {"java", "python", "C#"};

        for (int j = 0; j < arr.length; j++) {

            String reverse = "";
            for (int i = (arr[j].length() - 1); i >= 0; i--) {
                reverse += arr[j].charAt(i);
            }
            System.out.println(reverse);


        }
    }
}
