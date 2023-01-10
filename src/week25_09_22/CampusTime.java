package week25_09_22;

public class CampusTime {
    public static void main(String[] args) {
        int time=12;
        if (time>8&& time<23){
            System.out.println("Open");
        }
        else if (time<8&& time>23){
            System.out.println("Closed");
        }else{
            System.out.println("Invalid number");
        }
    }
}
