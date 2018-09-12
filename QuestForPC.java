import java.util.Random;
import java.util.Scanner;

public class QuestForPC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Let`s play the game, enter Your secret number from 1 till 100 and I will guess it!");
        int secretNumber = sc.nextInt();

        Random generator = new Random();

        int maxBound =101;
        int minBound =0;

        int numberFromPC = generator.nextInt(maxBound-minBound)+minBound;
        System.out.print(" Are the number "+ numberFromPC + " is greater, or smaller? If greater, please, enter >. If smaller, please, enter <.");

                do {
            //System.out.print(" Are the number "+ numberFromPC + " is greater, or smaller? If greater, please, enter >. If smaller, please, enter <.");
            String answer = sc.nextLine();

            if (answer.equals ("<")) {
                minBound= numberFromPC;
                numberFromPC = generator.nextInt(maxBound-minBound)+minBound;
                System.out.print(" Are the number "+ numberFromPC + " is greater, or smaller? If greater, please, enter >. If smaller, please, enter <.");
            }
            else if (answer.equals (">")) {
                maxBound=numberFromPC;
                numberFromPC = generator.nextInt(maxBound-minBound)+minBound;
                System.out.print(" Are the number "+ numberFromPC + " is greater, or smaller? If greater, please, enter >. If smaller, please, enter <.");
            }

        }
            while (numberFromPC!=secretNumber);
            System.out.println("I guessed" + numberFromPC);


    }
}
