public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        int primarySum = 0;
        int secondarySum = 0;

        StringBuilder primarySteps = new StringBuilder();
        StringBuilder secondarySteps = new StringBuilder();

        for (int i = 0; i < n; i++) {

            primarySum += matrix[i][i];
            primarySteps.append(matrix[i][i]);
            if (i < n - 1) primarySteps.append(" + ");

            secondarySum += matrix[i][n - 1 - i];
            secondarySteps.append(matrix[i][n - 1 - i]);
            if (i < n - 1) secondarySteps.append(" + ");
        }

        System.out.println("Primary Diagonal: " + primarySteps + " = " + primarySum);
        System.out.println("Secondary Diagonal: " + secondarySteps + " = " + secondarySum);
    }
}
