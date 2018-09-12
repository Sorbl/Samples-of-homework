import java.util.Arrays;
import java.util.Random;

public class TenRandomNumbersArrayMaxPutFirst {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int maxElement = 0;
        int temp=0;
        int number=0;
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(101);
                if (array[i] > maxElement) {
                    maxElement = array[i];
                    number = i;
                }
            }
            System.out.println(Arrays.toString(array));
            temp=array[number];
            array[number]=array[0];
            array[0]=temp;
        System.out.println(Arrays.toString(array));
        }
    }


