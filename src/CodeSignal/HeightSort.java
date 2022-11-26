package CodeSignal;

import java.util.Arrays;

public class HeightSort {


    public static void main(String[] args) {

        System.out.println(solution(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
    }

    static int[] solution(int[] a) {

        int[] tempArray = Arrays.stream(a).filter(i -> i != -1).sorted().toArray();
//        for (int i = 0; i < tempArray.length - 1; i++) {
//            if (tempArray[i] > tempArray[i + 1]) {
//                int temp = tempArray[i + 1];
//                tempArray[i + 1] = tempArray[i];
//                tempArray[i] = temp;
//            }
//        }
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                continue;
            }
            a[i] = tempArray[counter];
            counter++;
        }
        return a;

    }
}
