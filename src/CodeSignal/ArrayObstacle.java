package CodeSignal;

import java.util.Arrays;

public class ArrayObstacle {

    static int solution(int[] inputArray) {

        int max = Arrays.stream(inputArray).max().getAsInt();

        for (int i = 2; i <= max + 1; i++) {
            boolean hasReminder = true;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] % i == 0) {
                    hasReminder = false;
                }
            }
            if (!hasReminder) {
                return i;
            }
        }
        return 0;

    }

}
