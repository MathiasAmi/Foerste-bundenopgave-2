public class Chapter6 {


    public static void main(String[] args) {


//Opgave 6.1
        // I use the for loop, to determine how many times i want the program to run. in this case it needs to be 100.
        System.out.println("Opgave 6.1");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println(" ");
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        int temp = (n * (3 * n - 1)) / 2;
        return temp;
    }
}
