public class Main {
    public static void leftRotateByOne(int[] A) {
        int N = A.length;
        if (N == 0) {
            return; // Edge case for empty array

        }

        int first = A[0]; // Step 1: Store first element

        // Step 2: Shift elements to the left
        for (int i = 0; i < N - 1; i++) {
            A[i] = A[i + 1];
        }

        // Step 3: Move first element to last position
        A[N - 1] = first;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 }; // Example input
        leftRotateByOne(A);

        System.out.println("Rotated Array: " + java.util.Arrays.toString(A));
    }
}
