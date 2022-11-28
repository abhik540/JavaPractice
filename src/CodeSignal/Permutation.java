package CodeSignal;

import java.util.*;
import java.util.stream.Collectors;

public class Permutation {


    static List<String> permutation = new ArrayList<>();

    static List<String[]> permutationArr = new ArrayList<>();

    static void printPermutn(String str, String ans) {
        if (str.length() == 0) {
            permutation.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i);
            String ros1 = str.substring(i + 1);
            printPermutn(ros + ros1, ans + ch);
        }
    }

    public static void permute(List<String> list, int left, int right) {
        if (left == right) {
            System.out.println(list.toArray());
            permutationArr.add(list.toArray(new String[0]));
            return;
        }
        for (int j = left; j <= right; j++) {
            Collections.swap(list, left, j);
            permute(list, left + 1, right);
            Collections.swap(list, left, j);
        }
    }

    // Driver code
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("aba", "bbb", "bab");
        permute(inputs, 0, inputs.size() - 1);
       System.out.println(permutationArr);

        for (String[] result : permutationArr) {
            for (int i = 0; i < result.length - 1; i++) {
                for (int j = 1; j < result.length; j++) {
                    List<Character> first = result[i].chars()
                            .mapToObj(c -> (char) c).collect(Collectors.toList());
                    List<Character> second = result[j].chars()
                            .mapToObj(c -> (char) c).collect(Collectors.toList());


                }
            }

        }
    }
}
