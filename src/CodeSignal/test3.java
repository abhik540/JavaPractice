package CodeSignal;

import java.util.*;
import java.util.stream.Collectors;

public class test3 {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{25, 35, 872, 228, 53, 278, 872}));

        System.out.println(solution(new int[]{30, 72, 3, 227}));
        // System.out.println(isAnagrams(12346, 4321));
    }

    static long solution(int[] a) {
        int[] aaa = Arrays.stream(a)
                .map(i -> {
                    String aString = i + "";
                    List<Integer> aArray = new ArrayList<>();
                    for (int k = 0; k < aString.length(); k++) {
                        aArray.add(Integer.parseInt(aString.charAt(k) + ""));
                    }
                    aArray = aArray.stream().sorted().collect(Collectors.toList());
                    String out = "";
                    for (int k = 0; k < aArray.size(); k++) {
                        out += aArray.get(k);
                    }
                    return Integer.parseInt(out);
                })
                .toArray();

        long count = 0;
        for (int i = 0; i < aaa.length - 1; i++) {
            for (int j = i + 1; j < aaa.length; j++) {
                if (aaa[i] == aaa[j]) {
                    count++;
                }
            }
        }
        return count;

    }

//    static long solution(int[] a) {
//
//        long count = 0;
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//
//                if (isAnagrams(a[i], a[j])) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    static boolean isAnagrams(int a, int b) {
//        String aString = a + "";
//        String bString = b + "";
//
//        if (aString.length() != bString.length()) {
//            return false;
//        }
//
//
//        List<Integer> aArray = new ArrayList<>();
//        List<Integer> bArray = new ArrayList<>();
//
//        for (int i = 0; i < aString.length(); i++) {
//            aArray.add(Integer.parseInt(aString.charAt(i) + ""));
//        }
//
//        for (int i = 0; i < bString.length(); i++) {
//            bArray.add(Integer.parseInt(bString.charAt(i) + ""));
//        }
//        aArray = aArray.stream().sorted().collect(Collectors.toList());
//        bArray = bArray.stream().sorted().collect(Collectors.toList());
//
//        boolean same = true;
//        for (int i = 0; i < aArray.size(); i++) {
//            if (bArray.get(i) != aArray.get(i)) {
//                same = false;
//                break;
//            }
//        }
//
//        return same;
//
//    }
}
