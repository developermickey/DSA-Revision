import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static ArrayList<Integer> FindUnion(int[] A, int[] B, int N, int M) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hs.add(A[i]);
        }

        for (int i = 0; i < M; i++) {
            hs.add(B[i]);
        }

        for (int num : hs) {
            ans.add(num);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}
