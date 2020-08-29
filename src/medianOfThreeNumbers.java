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

        if (array[a] > array[b]) {
            if (array[b] > array[c]) {
                return array[b] + " is the middle value";
            } else if (array[a] > array[c]) {
                return array[c] + " is the middle value";
            } else {
                return array[a] + " is the middle value";
            }
        } else {
            if (array[a] > array[c]) {
                return array[a] +" is the middle value";
            } else if (array[b] > array[c]) {
                return array[c] + " is the middle value";
            } else {
                return array[b] + " is the middle value";
            }
        }
    }
}
