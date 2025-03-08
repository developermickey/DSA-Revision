import java.util.HashSet;

public class Main {

    public static int removeDuplicates(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        int N = A.length;
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (hs.add(A[i])) {
                A[j++] = A[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] A = { 1, 1, 2, 2, 3, 3, 3 };
        int k = removeDuplicates(A);

        for (int i = 0; i < k; i++) {
            System.out.print(A[i] + " ");
        }
    }
}