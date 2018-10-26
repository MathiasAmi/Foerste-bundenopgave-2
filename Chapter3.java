import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {

//Opgave 3.24

/*

        System.out.println("");
        System.out.println("Opgave 3.24");


        int card = (int) Math.floor((Math.random()*52)+1);
        switch (card) {
            case 1:
                System.out.print("Your card is ");
                System.out.println("Heart Ace");
                break;
            case 2:
                System.out.print("Your card is ");
                System.out.println("Club Ace");
                break;
            case 3:
                System.out.print("Your card is ");
                System.out.println("Spades Ace");
                break;
            case 4:
                System.out.print("Your card is ");
                System.out.println("Diamonds Ace");
                break;
            case 5:
                System.out.print("Your card is ");
                System.out.println("Diamonds 2");
                break;
            case 6:
                System.out.print("Your card is ");
                System.out.println("Diamonds 3");
                break;
            case 7:
                System.out.print("Your card is ");
                System.out.println("Diamonds 4");
                break;
            case 8:
                System.out.print("Your card is ");
                System.out.println("Diamonds 5");
                break;
            case 9:
                System.out.print("Your card is ");
                System.out.println("Diamonds 6");
                break;
            case 10:
                System.out.print("Your card is ");
                System.out.println("Diamonds 7");
                break;
            case 11:
                System.out.print("Your card is ");
                System.out.println("Diamonds 8");
                break;
            case 12:
                System.out.print("Your card is ");
                System.out.println("Spades 2");
                break;
            case 13:
                System.out.print("Your card is ");
                System.out.println("Hearts 2");
                break;
            case 14:
                System.out.print("Your card is ");
                System.out.println("Heart 3");
                break;
            case 15:
                System.out.print("Your card is ");
                System.out.println("Heart 4");
                break;
            case 16:
                System.out.print("Your card is ");
                System.out.println("Heart 5");
                break;
            case 17:
                System.out.print("Your card is ");
                System.out.println("Heart 6");
                break;
            case 18:
                System.out.print("Your card is ");
                System.out.println("Heart 7");
                break;
            case 19:
                System.out.print("Your card is ");
                System.out.println("Heart 8");
                break;
            case 20:
                System.out.print("Your card is ");
                System.out.println("Heart 9");
                break;
            case 21:
                System.out.print("Your card is ");
                System.out.println("Heart 10");
                break;
            case 22:
                System.out.print("Your card is ");
                System.out.println("Heart jack");
                break;
            case 23:
                System.out.print("Your card is ");
                System.out.println("Heart queen");
                break;
            case 24:
                System.out.print("Your card is ");
                System.out.println("Heart king");
                break;
            case 25:
                System.out.print("Your card is ");
                System.out.println("Spades 3");
                break;
            case 26:
                System.out.print("Your card is ");
                System.out.println("Diamonds 9");
                break;
            case 27:
                System.out.print("Your card is ");
                System.out.println("Diamonds 10");
                break;
            case 28:
                System.out.print("Your card is ");
                System.out.println("Diamonds jack");
                break;
            case 29:
                System.out.print("Your card is ");
                System.out.println("Diamonds queen");
                break;
            case 30:
                System.out.print("Your card is ");
                System.out.println("Diamonds King");
                break;
            case 31:
                System.out.print("Your card is ");
                System.out.println("Clubs 2");
                break;
            case 32:
                System.out.print("Your card is ");
                System.out.println("Clubs 3");
                break;
            case 33:
                System.out.print("Your card is ");
                System.out.println("Clubs 4");
                break;
            case 34:
                System.out.print("Your card is ");
                System.out.println("Clubs 5");
                break;
            case 35:
                System.out.print("Your card is ");
                System.out.println("Clubs 6");
                break;
            case 36:
                System.out.print("Your card is ");
                System.out.println("Clubs 7");
                break;
            case 37:
                System.out.print("Your card is ");
                System.out.println("Clubs 8");
                break;
            case 38:
                System.out.print("Your card is ");
                System.out.println("Clubs 9");
                break;
            case 39:
                System.out.print("Your card is ");
                System.out.println("Clubs 10");
                break;
            case 40:
                System.out.print("Your card is ");
                System.out.println("Clubs jack");
                break;
            case 41:
                System.out.print("Your card is ");
                System.out.println("Clubs queen");
                break;
            case 42:
                System.out.print("Your card is ");
                System.out.println("Clubs 4");
                break;
            case 44:
                System.out.print("Your card is ");
                System.out.println("Spades 5");
                break;
            case 45:
                System.out.print("Your card is ");
                System.out.println("Spades 6");
                break;
            case 46:
                System.out.print("Your card is ");
                System.out.println("Spades 7");
                break;
            case 47:
                System.out.print("Your card is ");
                System.out.println("Spades 8");
                break;
            case 48:
                System.out.print("Your card is ");
                System.out.println("Spades 9");
                break;
            case 49:
                System.out.print("Your card is ");
                System.out.println("Spades 10");
                break;
            case 50:
                System.out.print("Your card is ");
                System.out.println("Spades jack");
                break;
            case 51:
                System.out.print("Your card is ");
                System.out.println("Spades queen");
                break;
            case 52:
                System.out.print("Your card is ");
                System.out.println("Spades king");
                break;

                default:
                    System.out.println(card);



        }
*/


//Opgave 3.25

        System.out.println("");
        System.out.println("Opgave 3.25");
        System.out.println("Enter values for (x1,y1), (x2,y2), (x3,y3), (x4,y4):");
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double a = y1 - y2;
        double b = (x1 - x2);
        double c = y3 - y4;
        double d = (x3 - x4);
        double e = a*x1-b*y1;
        double f = c*x3-d*y3;
        double x = (e*d - b*f)/(a*d-b*c);
        double y = (a*f - e*c)/(a*d-b*c);




        System.out.println(x+","+y);











    }
}
