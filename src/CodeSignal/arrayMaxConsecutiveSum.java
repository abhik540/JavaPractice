package CodeSignal;

public class arrayMaxConsecutiveSum {


    int solution(int[] inputArray, int k) {
        int max = 0;

        for (int i = 0; i <= inputArray.length - k; i++) {
            int calcMax = 0;
            for (int j = i; j < i + k; j++) {
                calcMax += inputArray[j];
            }
            if (calcMax > max) {
                max = calcMax;
            }
        }

        return max;

    }
}


