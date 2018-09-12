import java.util.Random;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int enigma = randomGenerator.nextInt(101);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Try Your luck, enter the number");
            int numberFromUser = sc.nextInt();

            if (numberFromUser == enigma) {
                System.out.println("Exactly");
                break;
            } else if (numberFromUser < enigma) {
                System.out.println("Your number is smaller)");
            } else if (numberFromUser > enigma) {
                System.out.println("Your number is grater)");
            }
        }

    }
}

