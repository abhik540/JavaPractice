package CodeSignal;

public class InterestingPolygon {

    static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // 2 -> 1 + ( 2 + ( 2 - 1 ) ) + 1
        // 3 -> 1 + 3 + ( 3 + ( 3 - 1 ) ) + 3 + 1
        // 4 -> 1 + 3 + 5 + ( 4 + ( 4 - 1 ) ) + 5 + 3 + 1

        int result = 0;
        int addition = 1;
        for (int i = 0; i < n - 1; i++) {
            result += addition;
            addition = addition + 2;
        }
        result = 2 * result;
        result += n + (n - 1);

        return result;

    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
