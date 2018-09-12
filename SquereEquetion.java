import java.util.Scanner;

public class SquereEquetion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter a number of equation ax^2+bx+c=0");
        int aNumber = scan.nextInt();

        System.out.println("Please, enter b number of ax^2+bx+c=0");
        int bNumber = scan.nextInt();

        System.out.println("Please, enter c number of ax^2+bx+c=0");
        int cNumber = scan.nextInt();

        double discriminant = (Math.pow(bNumber, 2)) - (4 * aNumber * cNumber);
        //System.out.println("Discriminant of a,d,c is " + discriminant);

        if (discriminant >= 0) {
            System.out.println("X1 = " + (-bNumber+(Math.pow(discriminant,0.5)))/(2*aNumber));
            System.out.println("X2 = " + (-bNumber-(Math.pow(discriminant,0.5)))/(2*aNumber));
        } else {
            System.out.println("корней на множестве действительных чисел нет");
        }
    }
}
