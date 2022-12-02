package CodeSignal;

public class deleteDigit {

    public static void main(String[] args) {
        System.out.println(solution(152));
    }

    static int solution(int n) {

        String nString = n + "";

        int max = 0;
        for (int i = 0; i < nString.length(); i++) {
            StringBuilder sb = new StringBuilder(nString);
            sb.deleteCharAt(i);
            if (max < Integer.parseInt(sb.toString())) {
                max = Integer.parseInt(sb.toString());
            }
        }

        return max;

    }
}
