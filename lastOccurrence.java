public class lastOccurrence {
    public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;        
                left = mid + 1;      
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8};
        int key = 2;
        System.out.println("Last occurrence of " + key + ": " + lastOccurrence(arr, key)); 
    }
}
