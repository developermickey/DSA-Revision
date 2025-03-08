public class Main {
    public static int findTarget(int[] A, int target) {
        int N = A.length;
        int l = 0, h = N - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (A[mid] == target) {
                return mid;
            }

            if (A[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
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