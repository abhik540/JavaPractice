package CodeSignal;

import java.util.HashMap;
import java.util.Map;

public class ArrangePalindrome {

    public static void main(String[] args) {

        System.out.println(solution("aacbb"));
        // System.out.println(solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));

    }

    static boolean solution(String inputString) {

        int length = inputString.length();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char character = inputString.charAt(i);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        boolean canBePalindrome = true;
        int oddCount = 0;
        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
            if (length % 2 != 0) {
                if (mapElement.getValue() % 2 != 0) {
                    oddCount++;
                }
            } else {
                if (mapElement.getValue() % 2 != 0) {
                    canBePalindrome = false;
                    break;
                }
            }
        }

        return canBePalindrome && (oddCount == 0 || oddCount == 1);
    }
}
