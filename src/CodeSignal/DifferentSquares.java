package CodeSignal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentSquares {

    public static void main(String[] args) {
        solution(new int[][]{
                {1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}});
    }

    static int solution(int[][] matrix) {
        Set<String> set = new HashSet<>();
        for (int x = 0; x < matrix.length - 1; x++) {
            for (int y = 0; y < matrix[0].length - 1; y++) {
                String value = "";
                for (int i = x; i < x + 2; i++) {
                    for (int j = y; j < y + 2; j++) {
                        value += matrix[i][j] + ",";
                    }
                }
                set.add(value);
            }
        }

        return set.size();

    }

    static void print(int[][] arrays) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + i + "-" + j + "->");
                System.out.print(arrays[i][j]);
                System.out.print("] ");
            }
            System.out.println("");
        }
    }
}
