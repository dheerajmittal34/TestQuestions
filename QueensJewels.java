public class QueensJewels {

    public static int[] findFirstOccurrence(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int resultRow = -1;
        int resultCol = -1;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (matrix[i][mid] == target) {

                    resultRow = i;
                    resultCol = mid;
                    right = mid - 1;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (resultRow != -1) {
                break;
            }
        }

        return new int[]{resultRow, resultCol};
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 2},
            {3, 4, 4},
            {5, 6, 7}
        };
        int target = 4;

        int[] result = findFirstOccurrence(matrix, target);
        System.out.println("(" + result[0] + "," + result[1] + ")"); // Output: (1,1)
    }
}
