import java.util.Random;

public class TenRandomNumbersArrayPrintOutMax {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
                if (array[i] > maxValue) {
                maxValue = array[i];
            }
            System.out.println(array[i]);
                    }
                System.out.println("Max value is " + maxValue);
    }
}