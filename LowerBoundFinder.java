public class LowerBoundFinder {

    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }
        return left; 
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 6, 6, 8};

        System.out.println("Lower bound of 6: " + lowerBound(array1, 6)); 
        System.out.println("Lower bound of 5: " + lowerBound(array1, 5)); 
        System.out.println("Lower bound of 9: " + lowerBound(array1, 9)); 
        System.out.println("Lower bound of 0: " + lowerBound(array1, 0)); 
    }
}
