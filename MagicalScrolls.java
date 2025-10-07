public class MagicalScrolls {

    public static int[] findScroll(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1}; // Not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int target = 60;

        int[] result = findScroll(matrix, target);
        System.out.println("(" + result[0] + "," + result[1] + ")"); // Output: (1,2)
    }
}
