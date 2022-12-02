package CodeSignal;

import java.util.Arrays;

public class test2 {

    public static void main(String[] args) {
        // System.out.println(solution(new String[]{"Daisy", "Rose", "Hyacinth", "Poppy"}));

        System.out.println(solution(new String[]{"Clever"}));
    }

    static String solution(String[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }
        String out = "";
        int index = 0;
        while (max > index) {
            for (int i = 0; i < arr.length; i++) {
                try {
                    out += arr[i].charAt(index);
                } catch (Exception e) {

                }
            }
            index++;
        }

        return out;


    }
}
