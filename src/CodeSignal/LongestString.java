package CodeSignal;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestString {

    static String[] longestString(String[] input) {
        int length = 0;
        for(String s: input) {
            if(s.length() > length) {
                length = s.length();
            }
        }
        int finalLength = length;
        return Arrays.stream(input)
                .filter(s->s.length() == finalLength)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {

    }
}
