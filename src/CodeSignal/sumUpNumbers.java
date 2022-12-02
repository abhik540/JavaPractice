package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class sumUpNumbers {

    public static void main(String[] args) {
        // System.out.println(solution("2 apples, 12 oranges"));

        System.out.println(solution("abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -"));
    }


    static int solution(String inputString) {

        inputString = inputString.replaceAll("[^0-9]", "|");
        String[] split = inputString.split("\\|");
        int sum = 0;
        for (String s : split) {
            try {
                if (s.length() > 0) {
                    int value = Integer.parseInt(s);
                    sum += value;
                }
            } catch (Exception e) {

            }
        }
        return sum;
    }
//        String word = "";
//        List<Integer> numbers = new ArrayList<>();
//        String number = "";
//        for (int i = 0; i < inputString.length() - 1; i++) {
//            char nextChar = inputString.charAt(i + 1);
//            if(Character.isDigit(inputString.charAt(i)) && !Character.isDigit(nextChar)) {
//                number += inputString.charAt(i);
//            }
//
//            if (Character.isAlphabetic(inputString.charAt(i))
//                    || Character.isDigit(inputString.charAt(i))) {
//                if(word.length() > 0
//                        && Character.isDigit(inputString.charAt(i))){
//                    words.add(word);
//                    word = "";
//                }
//                word += inputString.charAt(i);
//            }
//
//            if (!(Character.isAlphabetic(inputString.charAt(i))
//                    || Character.isDigit(inputString.charAt(i)))) {
//                words.add(word);
//                word = "";
//            }
//        }
//        if (word.length() > 0) {
//            words.add(word);
//        }
//
//        int sum = 0;
//        for (String s : words) {
//            try {
//                int value = Integer.parseInt(s);
//                sum += value;
//            } catch (Exception e) {
//
//            }
//        }
//
//
//        return sum;
//    }

}
