import java.util.Scanner;

public class Chapter5 {


    public static void main(String[] args) {

//Opgave 5.1
        System.out.println("Opgave 5.1");
        Scanner sc = new Scanner(System.in);
// Prompt the user to enter an x of numbers, until they end the while loop with 0
        System.out.println("Enter an integer, the input ends if it is 0:");
        // Enter the code for the while loop.
        int count = 0;
        int positive = 0;
        int negative = 0;
        double sum = 0;
        int number = sc.nextInt();

        //Excudes program if the user enters 0 as the first value.

        if (number == 0){
            System.out.println("The only value entered was 0.");
            System.exit(1);
        }
        while (number != 0) {
            count += number;
            // adding the count for how many positive and negative numbers there are.
            if (number >= 0) {
                positive++;
            }
            if (number < 0) {
                negative++;
            }
            number = sc.nextInt();
            sum += number; //Adding the numbers.
            count++; //gets the number of numbers

        }
            double average = sum / count;

        //Show the results:

        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Sum of numbers: " + count);
        System.out.println("Average of numbers: " + average);

    }
}