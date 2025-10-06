public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };

        int n = 3; // size of matrix
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        // System.out.print("Spiral output: ");

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i]);
            }
            top ++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right]);
            }
            right --;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i]);
                }
                bottom --;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left]);
                }
                left ++;
            }
        }
    }
}
