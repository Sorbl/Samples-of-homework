import java.util.Scanner;

public class WhileEnter {
    public static void main(String[] args) {
        int secretKey = 123;
        Scanner sc = new Scanner(System.in);

        boolean isValidKey= false;
        while (!isValidKey) {
            System.out.print("Enter code:");
            int userInput = sc.nextInt();
            isValidKey = (secretKey == userInput);
        }
                System.out.print("Hello");
    }
}
