package CodeSignal;


public class buildPalindrome {


    public static void main(String[] args) {
        System.out.println(solution("abc"));
    }

    static String solution(String st) {

        boolean flag;
        int i = st.length();
        while (true) {
            flag = true;
            for (int j = 0; j < i - j - 1; j++) {
                if ((i - j - 1) < st.length() && st.charAt(j) != st.charAt(i - j - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int j = st.length(); j < i; j++) {
                    st += st.charAt(i - j - 1);
                }
                return st;
            }
            i++;
        }
    }

    static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        String reverse = sb.reverse().toString();
        return reverse.equals(string);
    }
}
