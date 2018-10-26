import java.util.Random;
import java.util.Scanner;
public class Chapter7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Make Scanner, and let the user input number of students, and the scores for each student.
        System.out.println("");
        System.out.println("Opgave 7.1");
        System.out.println();

        System.out.println("Enter number of students: ");
        int students = input.nextInt();
        int[] scores = new int[students];

        System.out.println("Enter " + scores.length + " scores");
        for (int i = 0 ; i < scores.length ; i++) {
            scores[i] = input.nextInt();
        }

        gradeStudents(scores, bestScore(scores));
    }

// Make the header for the score.


    public static int bestScore(int[]scores)
    {

        int bestScore = scores[0];

        for (int i = 1; i < scores.length; i++)
            if (bestScore < scores[i])
                bestScore = scores[i];

        return bestScore;
    }

    // Here we have the for if command, that contains an else if. This determines how the grade is given.

    public static void gradeStudents(int[] scores, int bestScore)
    {
        for (int i = 0 ; i < scores.length ; i++)
            if (scores[i] >= bestScore - 10)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A ");

            else if (scores[i] >= bestScore - 20)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B ");

            else if (scores[i] >= bestScore - 30)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C ");

            else if (scores[i] >= bestScore - 40)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D ");

            else
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F ");
    }


}



