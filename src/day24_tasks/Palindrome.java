package day24_tasks;
     import  day24_tasks.Reverse ; // on ecrit d'abord package puis la classe
public class Palindrome {

    public static boolean isPalindrome( String str){

        boolean result= Reverse.reverse(str).equalsIgnoreCase(str);// on commence par appeler la class puis la method.
        return result;
      
    }


    public static void main(String[] args) {
        boolean r= isPalindrome("level");
        System.out.println(r);

    }
}
