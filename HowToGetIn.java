import java.util.Scanner;

public class HowToGetIn {

    public static void main(String[] args) {

    int secretKey = 123;

        Scanner sc = new Scanner(System.in);

        int userInput;

        do {
            System.out.print("Please enter key");
            userInput = sc.nextInt();
        } while (userInput != secretKey);

        System.out.print("Hello");


    }
}
