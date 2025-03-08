public class Main {

    public static int removeDuplocate(int[] A) {
        int N = A.length;
        if (N == 0) // // Edge case: Empty array
            return 0;
        int i = 0; // Pointer for the position of unique elements

        // Single Loop Only Time Complexity is O(N) and No Extra Space O(1)
        // Iterate through array starting from index 1
        for (int j = 1; j < N; j++) {
            if (A[i] != A[j]) { // When a new unique element is found
                i++; // Move the unique pointer
                A[i] = A[j]; // Store the new unique value
            }
        }

        return i + 1; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] A = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
        int k = removeDuplocate(A);

        for (int i = 0; i < k; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
