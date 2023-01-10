package day23_Tasks;

public class GradeOfTheStudent {

    public static void gradeOfTheStudent(int score) {

        if (score >= 0 && score <= 100) {
            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : (score >= 50) ? 'E' : 'F';
            System.out.println(grade);
        } else {
            System.out.println("Score is invalid");
        }

    }
}
