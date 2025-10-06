public class AncientScroll {
    public static int searchScroll(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;  // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 7;

        int result = searchScroll(arr, key);
        System.out.println("Scroll found at index: " + result);  // Output: 2
    }
}
