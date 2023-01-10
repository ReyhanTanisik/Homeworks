package day14_tasks;

public class EmailTask2 {
    public static void main(String[] args) {
        String mail="reyhan_tanisik@gmail.com";
        String firsName=mail.substring(0,mail.indexOf("_"));
        String lastName=mail.substring(mail.indexOf("_")+1,mail.indexOf("@"));
        String domain=mail.substring(mail.indexOf("@")+1,mail.indexOf("."));
        System.out.println("firsName = " + firsName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);
    }
}
