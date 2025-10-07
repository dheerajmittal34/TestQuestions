public class CeilFinder {

    public static int findCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int ceil = -1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                ceil = arr[mid];   
                right = mid;     
            } else {
                left = mid + 1;    
            }
        }

        return ceil; 
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 6, 8};

        System.out.println("Ceil of 5: " + findCeil(array, 5));  // Output: 6
        System.out.println("Ceil of 6: " + findCeil(array, 6));  // Output: 6
        System.out.println("Ceil of 9: " + findCeil(array, 9));  // Output: -1
        System.out.println("Ceil of 0: " + findCeil(array, 0));  // Output: 1
    }
}
