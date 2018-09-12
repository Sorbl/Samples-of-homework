import java.util.Scanner;

public class Discriminant {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter a number");
        int aNumber = scan.nextInt();

        System.out.println("Please, enter b number");
        int bNumber = scan.nextInt();

        System.out.println("Please, enter c number");
        int cNumber = scan.nextInt();

        double discriminant = (Math.pow(bNumber,2)) - (4*aNumber*cNumber);
        System.out.print("Discriminant of a,d,c is " + discriminant);
    }
}