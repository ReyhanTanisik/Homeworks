package week25_09_22;

public class CharacterIdentity {
    public static void main(String[] args) {
        char id =999;
        if (id>='0' && id<='9') {
            System.out.println("Digit");
        }
        else if (id>='A'&& id<='Z'){
            System.out.println("Alphabet");
        }
        else if (id>='a' && id<='z'){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Special Character");
        }



    }



}
