import java.util.Scanner;

public class CompareAandBandC {
    public static void main(String[] args) {
        System.out.println("Please, enter first number");
        int a = getNumberFromUser();

        System.out.println("Please, enter second number");
        int b = getNumberFromUser();

        System.out.println("Please, enter third number");
        int c = getNumberFromUser();

compareThreeNumbers(a,b,c);

        }
    public static int getNumberFromUser () {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

        public static void compareThreeNumbers ( int aNumber, int bNumber, int cNumber){
            if ((aNumber == bNumber) && (bNumber == cNumber)) {
                System.out.println("All numbers are equals!");
            } else if ((aNumber >= bNumber) && (aNumber >= cNumber)) {
                System.out.println("The first number is the greatest!");
            } else if ((bNumber >= aNumber) && (bNumber >= cNumber)) {
                System.out.println("The second number is the greatest!");
            } else {
                System.out.println("The third number is the greatest!");
            }
            return;
        }
    }
