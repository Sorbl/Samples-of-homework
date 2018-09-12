import java.util.Scanner;

public class IfABC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter A");
        int aNumber = scan.nextInt();

        System.out.println("Please, enter B");
        int bNumber = scan.nextInt();

        System.out.println("Please, enter C");
        int cNumber = scan.nextInt();

        if ((aNumber > bNumber) && (aNumber > cNumber))
                {System.out.println("Highest number is " + aNumber);
        }
        else if ((bNumber > aNumber) && (bNumber > cNumber))
        {System.out.println("Highest number is " + aNumber);
        }
        else if ((cNumber > aNumber) && (cNumber > bNumber))
        {System.out.println("Highest number is " + cNumber);
        }
        else if ((cNumber == aNumber) && (cNumber == bNumber))
        {System.out.println("Numbers are equals A==B==C");
        }
        else if ((bNumber == aNumber) && (bNumber > cNumber))
        {System.out.println("Highest number is " + bNumber);
        }
        else if ((bNumber == cNumber) && (bNumber > aNumber)) {
            System.out.println("Highest number is " + bNumber);
        }
        else if ((cNumber == aNumber) && (cNumber > aNumber)) {
            System.out.println("Highest number is " + cNumber);
        }
        else if ((cNumber == bNumber) && (cNumber > aNumber)) {
            System.out.println("Highest number is " + cNumber);
        }
        else if ((aNumber == bNumber) && (aNumber > cNumber)) {
            System.out.println("Highest number is " + aNumber);
        }
        else if ((aNumber == cNumber) && (aNumber > bNumber)) {
            System.out.println("Highest number is " + aNumber);
        }
    }
}