package CodeSignal;

import java.util.Arrays;

public class SameArray {

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279},
                new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279}));
    }

    static boolean solution(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        // False if more than 2 element need to swap
        int noOfSwap = 0;
        for (int i = 0; i < a.length; i++) {
            if (b[i] != a[i]) {
                noOfSwap++;
            }
        }

        if (noOfSwap > 2) {
            return false;
        }

        int[] aSort = Arrays.stream(a).sorted().toArray();
        int[] bSort = Arrays.stream(b).sorted().toArray();

        boolean isSame = true;
        for (int i = 0; i < aSort.length; i++) {
            if (bSort[i] != aSort[i]) {
                isSame = false;
                break;
            }
        }

        return isSame;

    }
}
