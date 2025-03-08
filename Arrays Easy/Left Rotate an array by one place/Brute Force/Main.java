public class Main {
    public static void leftRotateByOne(int[] A) {
        int N = A.length;
        int[] temp = new int[N];

        for (int i = 1; i < N; i++) {
            temp[i - 1] = A[i];
        }

        temp[N - 1] = A[0];
        for (int i = 0; i < N; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 }; // Example input
        leftRotateByOne(A);
    }
}
