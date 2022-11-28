package CodeSignal;

public class BlurArrayPixel {

    public static void main(String[] args) {
        int[][] image = new int[][]{
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}};
        int[][] image1 = new int[][]{
                {0, 18, 9},
                {27, 9, 0},
                {81, 63, 45}};

        int[][] image2 = new int[][]{
                {36, 0, 18, 9},
                {27, 54, 9, 0},
                {81, 63, 72, 45}};

        print(solution(image2));

    }

    static int[][] solution(int[][] image) {

        int xLength = image.length;
        int yLength = image[0].length;

        if (xLength < 3 || yLength < 3) {
            return new int[0][0];
        }
        int[][] result = new int[xLength + 1 - 3][yLength + 1 - 3];

        for (int i = 0; i < xLength + 1 - 3; i++) {
            for (int j = 0; j < yLength + 1 - 3; j++) {
                int value = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        value += image[x][y];
                    }
                }
                result[i][j] = value / 9;
            }
        }
        return result;

    }

    static void print(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println("");
        }
    }

}
