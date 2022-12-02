package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class longestWord {

    public static void main(String[] args) {
        System.out.println(solution1("aa bbb ccc dddd eeeee"));
    }

    static String solution1(String text) {

        String word = "";
        List<String> words = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                word += text.charAt(i);
            }

            if (!Character.isAlphabetic(text.charAt(i))) {
                words.add(word);
                word = "";
            }
        }

        if(word.length() > 0) {
            words.add(word);
        }

        if(words.size() == 0) {
            return text;
        }
        String longest = null;

        for (String s : words) {
            if (longest == null || longest.length() < s.length()) {
                longest = s;
            }
        }
        return longest;

//        String[] split = text.split(" ");
//
//        String longest = null;
//        for (String s : split) {
//            s = s.replaceAll("[^a-zA-Z]", "");
//            if (longest == null || longest.length() < s.length()) {
//                longest = s;
//            }
//        }
//        return longest;

    }

    String solution(String text) {

        String[] split = text.split(" ");

        String longest = null;
        for (String s : split) {
            s = s.replaceAll("[^a-zA-Z]", "");
            if (longest == null || longest.length() < s.length()) {
                longest = s;
            }
        }
        return longest;

    }

}
