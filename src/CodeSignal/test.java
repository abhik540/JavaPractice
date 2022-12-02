package CodeSignal;

public class test {

    public static void main(String[] args) {


        System.out.println(solution(new int[]{8, 5, 6, 16, 5}, 1, 3));
    }

    static boolean[] solution(int[] numbers, int left, int right) {

        boolean[] result = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = left; j <= right; j++) {
                if ((i + 1) * j == numbers[i]) {
                    result[i] = true;
                    break;
                } else {
                    result[i] = false;
                }
            }
        }
        return result;

    }
}
