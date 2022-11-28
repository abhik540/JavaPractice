package CodeSignal;

public class ChangeArray {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{2, 1, 10, 1}));
        System.out.println(solution(new int[]{1, 1, 1}));
    }

    static int solution(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                while (inputArray[i] >= inputArray[i + 1]) {
                    inputArray[i + 1] = inputArray[i + 1] + 1;
                    count++;
                }
            }
        }
        return count;

    }
}
