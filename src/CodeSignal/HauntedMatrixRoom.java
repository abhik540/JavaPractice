package CodeSignal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HauntedMatrixRoom {

    public static void main(String[] args) {

    }

    static int solution(int[][] array) {
        int sum = 0;
        Set<Integer> hauntedColumns = new HashSet<>();
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[0].length; y++) {
                if (array[x][y] == 0) {
                    hauntedColumns.add(y);
                    continue;
                }
                if (hauntedColumns.contains(y)) {
                    continue;
                }
                sum += array[x][y];

            }
        }
        return sum;
    }
}
