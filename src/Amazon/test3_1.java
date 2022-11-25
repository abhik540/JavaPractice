package Amazon;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class test3_1 {


    static List<int[]> neighbors(int x, int y, boolean includeDiagonal) {
        if (includeDiagonal) {
            return Arrays.asList(new int[]{x, y - 1}, new int[]{x, y + 1}, new int[]{x - 1, y}, new int[]{x + 1, y}, new int[]{x - 1, y - 1}, new int[]{x - 1, y + 1}, new int[]{x + 1, y - 1}, new int[]{x + 1, y + 1});
        }
        return Arrays.asList(new int[]{x, y - 1}, new int[]{x, y + 1}, new int[]{x - 1, y}, new int[]{x + 1, y});
    }

    static int getIsland(int[][] arrays) {
        print(arrays);

        int islandCount = 0;

        int[][] visited = new int[arrays.length][arrays[0].length];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (visited[i][j] == 1) {
                    continue;
                }
                if (arrays[i][j] == 0) {
                    visited[i][j] = 1;
                    continue;
                }
                Stack<int[]> stack = new Stack<>();
                visited[i][j] = 1;
                stack.push(new int[]{i, j});
                while (stack.size() > 0) {
                    int[] ints = stack.pop();
                    final List<int[]> neighbors = neighbors(ints[0], ints[1], true);
                    visited[i][j] = 1;
                    for (int[] neighbor : neighbors) {
                        int x = neighbor[0];
                        int y = neighbor[1];
                        try {
                            if (visited[x][y] == 1) {
                                continue;
                            }
                            if (arrays[x][y] == 0) {
                                visited[x][y] = 1;
                                continue;
                            }
                            visited[x][y] = 1;
                            stack.push(neighbor);
                        } catch (Exception e) {

                        }
                    }
                }
                islandCount = islandCount + 1;


            }
        }
        return islandCount;
    }

    static void print(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 0, 1, 1}, {1, 1, 1, 1}};
        //  int[][] input = new int[][]{{1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}};
        //  int[][] input = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        // int[][] input = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};

        System.out.println(getIsland(input));
    }
}
