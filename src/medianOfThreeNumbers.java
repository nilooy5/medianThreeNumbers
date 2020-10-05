import java.util.Scanner;

public class medianOfThreeNumbers {
    public static void main(String[] args) {
        int [] intArray = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i=0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(getMedian(intArray));
    }

    private static String getMedian(int[] array) {

        String message = " is the median value";

        if (array[0] > array[1]) {
            if (array[1] > array[2]) {
                return array[1] + message;
            } else if (array[0] > array[2]) {
                return array[2] + message;
            } else {
                return array[0] + message;
            }
        } else {
            if (array[0] > array[2]) {
                return array[0] + message;
            } else if (array[1] > array[2]) {
                return array[2] + message;
            } else {
                return array[1] + message;
            }
        }
    }
}
