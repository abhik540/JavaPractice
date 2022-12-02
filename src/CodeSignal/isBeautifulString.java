package CodeSignal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class isBeautifulString {

    public static void main(String[] args) {
        System.out.println(solution("zaa"));
    }

    static boolean solution(String inputString) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }

        inputString = inputString.toLowerCase();

        for (int j = 0; j < inputString.length(); j++) {
            if (Objects.nonNull(map.get(inputString.charAt(j)))) {
                map.put(inputString.charAt(j), map.get(inputString.charAt(j)) + 1);
            }
        }

        boolean beautiful = true;
        int currentCount = map.get('a');
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 'a') {
                continue;
            }
            if (entry.getValue() <= currentCount) {
                currentCount = entry.getValue();
                continue;
            }
            beautiful = false;
        }

        return beautiful;
    }
}
