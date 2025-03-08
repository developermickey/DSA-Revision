
public class Main {
    public static int[] moveZeros(int N, int[] A) {
        int j = -1;

        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return A;
        }

        for (int i = j + 1; i < N; i++) {
            if (A[i] != 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
        }

        return A;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
