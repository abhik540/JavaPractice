package CodeSignal;

import java.util.Arrays;
import java.util.List;

public class Minesweeper {

    static List<int[]> neighbors(int x, int y) {
        return Arrays.asList(
                new int[]{x, y - 1},
                new int[]{x, y + 1},
                new int[]{x - 1, y},
                new int[]{x + 1, y},
                new int[]{x - 1, y - 1},
                new int[]{x - 1, y + 1},
                new int[]{x + 1, y - 1},
                new int[]{x + 1, y + 1});

    }

    public static void main(String[] args) {
        boolean[][] input = new boolean[][]{
                {true, false, false},
                {false, true, false},
                {false, false, false}};
        print(solution(input));

        boolean[][] input1 = new boolean[][]{
                {true, false, false, true},
                {false, false, true, false},
                {true, true, false, true}
        };

        print(solution(input1));
    }

    static void print(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println("");
        }
    }

    static int[][] solution(boolean[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                List<int[]> neighbors = neighbors(i, j);
                int value = 0;
                for (int[] neighbor : neighbors) {
                    try {
                        if (matrix[neighbor[0]][neighbor[1]]) {
                            value += 1;
                        }
                    } catch (Exception e) {

                    }
                }
                result[i][j] = value;

            }
        }

        return result;
    }
}
