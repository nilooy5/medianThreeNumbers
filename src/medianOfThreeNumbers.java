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
        int a = 0;
        int b = 1;
        int c = 2;

        String message = " is the median value";

        if (array[a] > array[b]) {
            if (array[b] > array[c]) {
                return array[b] + message;
            } else if (array[a] > array[c]) {
                return array[c] + message;
            } else {
                return array[a] + message;
            }
        } else {
            if (array[a] > array[c]) {
                return array[a] + message;
            } else if (array[b] > array[c]) {
                return array[c] + message;
            } else {
                return array[b] + message;
            }
        }
    }
}
