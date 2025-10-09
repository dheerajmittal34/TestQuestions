import java.util.HashSet;

class Duplicate_Elemnt_In_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        boolean hasDuplicate = containsDuplicate(arr);
        System.out.println(hasDuplicate);  // Output: true
    }

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; // No duplicates found
    }
}
