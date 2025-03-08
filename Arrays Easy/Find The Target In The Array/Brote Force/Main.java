
public class Main {
    public static int findTarget(int[] A, int target) {
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (A[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int target = 3;
        int ans = findTarget(A, target);

        System.err.println(ans);
    }
}
