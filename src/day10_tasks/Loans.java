package day10_tasks;

public class Loans {
    public static void main(String[] args) {
        int salary=50000;
        int creditScore =765;
        String result=(salary>=60000 && creditScore>=650)? "Loan Approved" : "Loan Denied";
        System.out.println("result = " + result);
    }
}
