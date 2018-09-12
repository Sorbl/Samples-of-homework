import java.util.Scanner;

public class InvolutionOfNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter the number");
        int firstNumber = scan.nextInt();

        double a = firstNumber;
        double b = 2;
        double inv = (Math.pow(a,b));
        //System.out.println(Math.pow(a,b));
        System.out.print("Involution of Your number is " + inv);
    }
}