package day11_tasks;

public class BrowserName {
    public static void main(String[] args) {
        String browserName="Chrome";
        switch(browserName){
            case "Chrome": case "Opera" : case "Edge" : case "Safari": case "Firefox":
                System.out.println(browserName+ " is opening .");
                break;
            default:
                System.out.println("Invalid Browser");
                break;

        }
    }
}
