public class Main {

    public static void rev(int[] A, int start, int end) {
        while (start <= end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftRotate(int[] A, int n, int d) {
        if (n == 0) {
            return;
        }

        d = d % n;

        rev(A, 0, d - 1);
        rev(A, d, n - 1);
        rev(A, 0, n - 1);

    }

    public static void main(String[] args) {
        int n = 7;
        int[] A = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;

        System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println();

        leftRotate(A, n, d);
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println();
    }
}
