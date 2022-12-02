package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class lineEncoding {

    public static void main(String[] args) {

        System.out.println(solution("abbcabb"));
    }

    static String solution(String s) {

        int i = 1;
        String out = "";
        int count = 1;
        Character prevChar = s.charAt(0);
        while (i < s.length()) {
            if (prevChar == s.charAt(i)) {
                count ++;
            } else {
                if (count > 0 && prevChar != s.charAt(i)) {
                    out += (count == 1 ? "" : count) + "" + prevChar;
                }
                count = 1;
            }

            prevChar = s.charAt(i);
            i++;
        }
        return out + (count == 1 ? "" : count) + "" + prevChar;

    }
}
