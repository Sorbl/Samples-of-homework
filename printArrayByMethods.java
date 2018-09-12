import java.util.Random;

public class printArrayByMethods {

    public static void main(String[] args) {
int[] array = createArray(10);
fillArrayWithRAndomNumbers(array,101);
printArrayToConsole(array);
    }

    public static int[] createArray(int arrayLenght) {
        return new int[arrayLenght];
    }

    public static void fillArrayWithRAndomNumbers(int[] array, int bounds) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bounds);
        }
    }

    public static void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


