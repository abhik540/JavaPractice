package CodeSignal;

public class IsMAC48Address {

    public static void main(String[] args) {
        System.out.println(solution("0A"));
    }

    static boolean solution(String inputString) {

        if (inputString.endsWith("-")) {
            return false;
        }
        String[] splits = inputString.split("-");
        if (splits.length != 6) {
            return false;
        }
        for (String split : splits) {
            if (split.length() != 2) {
                return false;
            }
            if (!split.matches("^[0-9A-F]*$")) {
                return false;
            }
        }
        return true;
    }


}
