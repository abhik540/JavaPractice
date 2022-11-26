package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacter {


    public static void main(String[] args) {

        System.out.println(solution("aabcc", "adcaa"));
    }

    static int solution(String s1, String s2) {

        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(s1.charAt(i) + "")) {
                characters.add(s1.charAt(i));
                s2 = s2.replaceFirst(s1.charAt(i) + "", "");
            }
        }
        return characters.size();

    }
}
