package Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test1_1 {

    public static List<Integer> getCurrentState(List<Integer> init, Integer day) {
        while (day > 0) {
            init = init.stream().map(i -> {

                return 1;
            }).collect(Collectors.toList());
            day--;
        }
        return init;
    }

    public static int[] getState(int[] init, int day) {
        if (day == 0) {
            return init;
        }
        int[] state = new int[init.length];

        for (int j = 0; j < day; j++) {
            for (int i = 0; i < state.length; i++) {
                if (i == 0) {
                    if (init[i + 1] == 0) {
                        state[i] = 0;
                    } else {
                        state[i] = 1;
                    }
                } else if (i == state.length - 1) {
                    if (init[i - 1] == 0) {
                        state[i] = 0;
                    } else {
                        state[i] = 1;
                    }
                } else {
                    state[i] = init[i - 1] == init[i + 1] ? 0 : 1;
                }
            }
            for (int i = 0; i < init.length; i++) {
                init[i] = state[i];
            }
        }

        return state;
    }

    public static void main(String[] args) {
        // int[] answer = getState(new int[]{1, 0, 1, 0, 1, 0, 1, 0}, 3);
        System.out.println(getCurrentState(Arrays.asList(1, 0, 1, 0, 1, 0, 1, 0), 2));
    }
}
