public class UpperBoundFinder {

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }

        return left; 

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 6, 8};

        System.out.println("Upper bound of 6: " + upperBound(array, 6)); 
        System.out.println("Upper bound of 7: " + upperBound(array, 7)); 
        System.out.println("Upper bound of 8: " + upperBound(array, 8)); 
        System.out.println("Upper bound of 0: " + upperBound(array, 0)); 
    }
}
