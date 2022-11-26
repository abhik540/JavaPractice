package CodeSignal;

public class isLucky {

    public static void main(String[] args) {

        System.out.println(solution(1230));
    }

    static boolean solution(int n) {
        String nString = n + "";

        if (nString.length() == 0) {
            return false;
        }

        String firstHalf = nString.substring(0, (nString.length() / 2));
        String secondHalf = nString.substring((nString.length() + 1) / 2, nString.length());


        return firstHalf.chars().reduce(0, (a, b) -> a + b)
                == secondHalf.chars().reduce(0, (a, b) -> a + b);

    }
}
