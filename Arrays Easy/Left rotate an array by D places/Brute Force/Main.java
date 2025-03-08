
public class Main {

    public static void leftRotate(int[] A, int n, int d) {
        if (n == 0) {
            return;
        }

        d = d % n;

        if (d == 0) {
            return;
        }

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = A[i];
        }

        for (int i = d; i < n; i++) {
            A[i - d] = A[i];
        }

        for (int i = n - d; i < n; i++) {
            A[i] = temp[i - (n - d)];
        }
    }

    public static void main(String args[]) {
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