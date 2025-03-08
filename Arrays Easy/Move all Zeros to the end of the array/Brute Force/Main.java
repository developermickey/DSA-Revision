import java.util.ArrayList;

public class Main {

    public static int[] moveZeros(int N, int[] A) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] != 0) {
                ans.add(A[i]);
            }
        }

        int len = ans.size();

        for (int i = 0; i < len; i++) {
            A[i] = ans.get(i);
        }

        for (int i = len; i < N; i++) {
            A[i] = 0;
        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int N = 10;
        int[] ans = moveZeros(N, A);
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
