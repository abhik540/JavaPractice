package CodeSignal;

import java.util.Arrays;

public class absoluteValuesSumMinimization {
    public static void main(String[] args) {


        System.out.println(solution(new int[]{2, 4, 7}));
    }

    static int solution(int[] a) {
        int returnValue = a[0];
        int min = Arrays.stream(a)
                .map(i -> Math.abs(i - a[0]))
                .reduce(0, (x, y) -> (x + y));
        for (int i = 1; i < a.length; i++) {
            int calcMin = 0;
            for (int j = 0; j < a.length; j++) {
                calcMin += Math.abs(a[j] - a[i]);
            }
            if(calcMin < min) {
                min = calcMin;
                returnValue = a[i];
            }
        }

        return returnValue;

    }

}
