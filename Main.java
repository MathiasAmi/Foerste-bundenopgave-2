import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

// Opgave 4.1

        System.out.println("Opgave 4.1");
        // Prompt the user to enter the length from the center to a vertex:
        System.out.println("Enter the length from the center to a vertex:");
        Scanner sc = new Scanner(System.in);
        // Adding the formula in the code, and makes the program write two decimals.

        double length = sc.nextDouble();
        double side = 2 * length * Math.sin(Math.PI/5);
        double area = (5*Math.pow(side,2) / (4*Math.tan(Math.PI/5)));
        double roundOff = Math.round(area * 100.0) / 100.0;

        //Print out the answer and rounding off

        System.out.println("The area of the pentagon is " + roundOff);




    }
}
