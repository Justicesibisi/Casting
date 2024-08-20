import java.util.Scanner;

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int acquiredScore = 0;

        
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter score for Student " + i + ": ");
            int score = scanner.nextInt();

           
            if (score >= 0 && score < 40) {
                System.out.println("Student " + i + ": Failed");
            } else if (score >= 40 && score < 50) {
                System.out.println("Student " + i + ": Pass, improvements to be done");
            } else if (score >= 50 && score < 60) {
                System.out.println("Student " + i + ": Pass");
            } else if (score >= 60 && score < 70) {
                System.out.println("Student " + i + ": Pass, keep it up");
            } else if (score >= 70 && score < 80) {
                System.out.println("Student " + i + ": Excellent");
            } else if (score >= 80 && score <= 100) {
                System.out.println("Student " + i + ": Perfect, Distinction obtained");
            } 
            
            else{
                System.out.println("Student " + i + ": Invalid score");
                }

            
            acquiredScore += score;
        }

      
        int s = acquiredScore;

      
        System.out.println("Total acquired score: " + acquiredScore);
        System.out.println("Sum of all acquired scores: " + s);

       
        double scoreAsDouble = (double) acquiredScore;
        int scoreAsInt = (int) scoreAsDouble;
        float finalScoreAsfloat = (float) scoreAsInt;
       
      
        System.out.println("Acquired score as double: " + scoreAsDouble);
        System.out.println("Acquired score as int: " + scoreAsInt);
        System.out.println("Final acquired score as float: " + finalScoreAsfloat);
    }
}
