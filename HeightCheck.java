public class HeightCheck {
    public static void main(String[] args) {
        int[] heights = {150, 45, 160, 170}; 

        boolean isSorted = checkNonDecreasing(heights);

        if (isSorted) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean checkNonDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
}
