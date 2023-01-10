package day14_tasks;



public class EmailTask1 {
    public static void main(String[] args) {
        String eMail="reyhan_tanisik@gmail.com";
        String firstName=eMail.substring(0, eMail.indexOf("_"));
        String lastName=eMail.substring(eMail.indexOf("_")+1,eMail.indexOf("@"));
        System.out.println(lastName+"_"+firstName+"@gmail.com");
    }
}
