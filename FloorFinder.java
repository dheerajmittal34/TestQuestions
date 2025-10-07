public class FloorFinder {

    public static int findFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                floor = arr[mid];   // Possible floor found
                left = mid + 1;     // Try to find a larger one on the right
            } else {
                right = mid - 1;    // Move left to find smaller value
            }
        }

        return floor; // Returns the actual value or -1 if not found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 6, 8};

        System.out.println("Floor of 5: " + findFloor(array, 5));  // Output: 4
        System.out.println("Floor of 6: " + findFloor(array, 6));  // Output: 6
        System.out.println("Floor of 0: " + findFloor(array, 0));  // Output: -1
        System.out.println("Floor of 10: " + findFloor(array, 10)); // Output: 8
    }
}
