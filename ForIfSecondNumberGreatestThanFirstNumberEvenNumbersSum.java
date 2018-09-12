import java.util.Scanner;

public class ForIfSecondNumberGreatestThanFirstNumberEvenNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter the first number");
        int firstNumber = sc.nextInt();

        System.out.print("Please, enter the second number");
        int secondNumber = sc.nextInt();

        //if ((firstNumber == 1) && (secondNumber > firstNumber)) {
        //    int sum1 = (secondNumber) * (secondNumber + 1) / 2;
         //   System.out.println(sum1);
        //}
        if (secondNumber > firstNumber) {
            int sum = 0;
            for (int i = firstNumber; i < secondNumber + 1; i++) {
                sum += i;
                System.out.println(sum);
            }
        }

    }
}