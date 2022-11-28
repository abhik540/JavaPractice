package CodeSignal;

import java.util.HashMap;
import java.util.Map;

public class AlphabetLoop {

    public static void main(String[] args) {
        System.out.println(solution("asdz"));
    }

    static String solution(String inputString) {
        String out = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'z') {
                out += 'a';
            } else if (inputString.charAt(i) == 'Z') {
                out += 'A';
            } else {
                char letter = inputString.charAt(i);
                out += String.valueOf((char) (letter + 1));
            }
        }
        return out;

    }
}
