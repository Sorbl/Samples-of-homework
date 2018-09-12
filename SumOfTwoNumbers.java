import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Please, enter first number");
        int firstNumber= scan.nextInt();

        System.out.println("Please, enter second number");
        int secondNumber = scan.nextInt();

        int sumOfBothNumbers = firstNumber + secondNumber;
        System.out.print("Sum of both numbers is " + sumOfBothNumbers);

    }
}
