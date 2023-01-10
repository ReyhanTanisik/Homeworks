package day27_tasks;

public class UpperLowerCaseFrequency {


    public static void upperLowerEquality ( String str){
        int frequencyUpperCase=0;
        int frequencyLowerCase=0;

        for (int i = 0; i < str.length() ; i++) {
            char each= str.charAt(i);
            if( Character.isLowerCase(each)){
                frequencyLowerCase++;
            }
            if(Character.isUpperCase(each)){
                frequencyUpperCase++;
            }

        }

        if(frequencyLowerCase==frequencyLowerCase){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }



}
