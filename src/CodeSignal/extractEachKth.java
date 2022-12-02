package CodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class extractEachKth {

    public static void main(String[] args) {

    }

    int[] solution_1(int[] inputArray, int k) {
        List<Integer> results = new ArrayList<>();
        for (int i = 1; i <= inputArray.length; i++) {
            if (i % k != 0) {
                results.add(inputArray[i - 1]);
            }
        }

        return results.stream().mapToInt(Integer::intValue).toArray();
    }

    int[] solution(int[] inputArray, int k) {

        AtomicInteger index = new AtomicInteger();

        return Arrays.stream(inputArray)
                .filter(str -> index.getAndIncrement() % k != 0)
                .toArray();
    }

    int[] solution1(int[] inputArray, int k) {

        return IntStream.range(0, inputArray.length)
                .filter(index -> index % k!=0)
                .toArray();
    }
}
