package CodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class stringsRearrangement {
    public static void main(String[] args) {


//        System.out.println(solution(new String[]{
//                "aba",
//                "bbb",
//                "bab"
//        }));

        System.out.println(solution(new String[]{
                "q",
                "q"
        }));
//
//        System.out.println(solution(new String[]{
//                "ab",
//                "bb",
//                "aa"
//        }));

    }

    static List<String[]> permutationArr = new ArrayList<>();


    static boolean solution(String[] inputArray) {
        List<String> input = Arrays.stream(inputArray).collect(Collectors.toList());
        permute(input, 0, input.size() - 1);
        for (String[] result : permutationArr) {
            boolean charDiffOne = true;

            for (int i = 0; i < result.length - 1; i++) {
                String first = result[i];
                String second = result[i + 1];
                String firstResult = first;
                String secondResult = second;
                for (int x = 0; x < first.length(); x++) {
                    char charF = first.charAt(x);
                    char charS = second.charAt(x);
                    if (charF == charS) {
                        secondResult = secondResult.replaceFirst(charF + "", "");
                        firstResult = firstResult.replaceFirst(charF + "", "");
                    }
                }
                if (secondResult.length() > 1 || (secondResult.length() == 0 && firstResult.length() == 0)) {
                    charDiffOne = false;
                    break;
                }
            }
            if (charDiffOne) {
                return true;
            }
        }
        return false;
    }

    static void permute(List<String> list, int left, int right) {
        if (left == right) {
            permutationArr.add(list.toArray(new String[0]));
            return;
        }
        for (int j = left; j <= right; j++) {
            Collections.swap(list, left, j);
            permute(list, left + 1, right);
            Collections.swap(list, left, j);
        }
    }
}
