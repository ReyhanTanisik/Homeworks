package day20_tasks;

public class task1ClassMates {
    public static void main(String[] args) {
        String[] classmates= {"Ali Dağ","Erdem Ergül","Kalbinur Duzkalem","Büşra Tamtamiş","Omer Yılmaz","Mehmet Aslan","Bekir Yılmaz"};
        for (String each: classmates){
            System.out.println( ""+each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1));
        }
    }
}
