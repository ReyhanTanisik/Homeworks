package day24_tasks;

public class Reverse {


     public static String reverse( String str){
         char [] chars = str.toCharArray();
         String reversed="";
         for (int i = chars.length - 1; i >= 0; i--) {
             reversed += chars[i];

         }
         return reversed;
     }

    public static void main(String[] args) {
       String s1= reverse("elma");
        System.out.println(s1);
    }


}
