import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] result = flip(new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        });
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] flip(int[][] image) {
        for (int[] row : image) {
            int n = row.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                // Swap and invert using XOR
                int temp = row[i] ^ 1;
                row[i] = row[n - 1 - i] ^ 1;
                row[n - 1 - i] = temp;
            }
        }
        return image;
    }
}
