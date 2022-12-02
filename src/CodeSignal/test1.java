package CodeSignal;

import java.util.Arrays;
import java.util.List;

public class test1 {

    public static void main(String[] args) {
        // System.out.println(solution("010", "amazing"));

        System.out.println(solution("0", "y"));

        // System.out.println(solution("00", "aaaaaaaaaa"));
    }

    static int solution(String pattern, String source) {

        source = source.toLowerCase();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int count = 0;
        for (int i = 0; i <= source.length() - pattern.length(); i++) {
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                char chara = source.charAt(i + j);
                if ((pattern.charAt(j) == '0' && vowels.contains(chara))
                        || (pattern.charAt(j) == '1' && !vowels.contains(chara))) {
                    continue;
                }
                match = false;
            }
            if (match) {
                count++;
            }
        }

        return count;

    }
}
