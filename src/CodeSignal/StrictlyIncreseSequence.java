package CodeSignal;

import java.util.stream.IntStream;

public class StrictlyIncreseSequence {
    public static void main(String[] args) {

        System.out.println(isIncreasingSequence(new int[]{1, 2, 2}));

    }

    boolean solution_final(int[] sequence) {

        int count = 0;

        // Store the index of the element
        // that needs to be removed
        int index = -1;

        // Traverse the range [1, N - 1]
        for (int i = 1; i < sequence.length; i++) {

            // If arr[i-1] is greater than
            // or equal to arr[i]
            if (sequence[i - 1] >= sequence[i]) {

                // Increment the count by 1
                count++;

                // Update index
                index = i;
            }
        }

        // If count is greater than one
        if (count > 1)
            return false;

        // If no element is removed
        if (count == 0)
            return true;

        // If only the last or the
        // first element is removed
        if (index == sequence.length - 1 || index == 1)
            return true;

        // If a[index] is removed
        if (sequence[index - 1] < sequence[index + 1])
            return true;

        // If a[index - 1] is removed
        if (index - 2 >= 0 && sequence[index - 2] < sequence[index])
            return true;

        // if there is no element to compare
        if (index < 0)
            return true;

        return false;
    }

    boolean solution(int[] sequence) {

        if (isIncreasingSequence(sequence)) {
            return true;
        }
        for (int i = 0; i < sequence.length; i++) {
            int temp[] = removeTheElement(sequence, i);
            if (isIncreasingSequence(temp)) {
                return true;
            }
        }

        return false;

    }

    static boolean isIncreasingSequence(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {
            return arr;
        }

        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }
}
