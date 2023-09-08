import java.util.*;

public class Rug {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int m = r.nextInt();
        int[][] a = new int[n][m];

        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = r.nextInt();
            }
        }

        // Initialize sums for even and odd elements
        int evenSum = 0;
        int oddSum = 0;

        // Traverse the matrix to calculate sum of even and odd elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] % 2 == 0) {
                    evenSum += a[i][j];
                } else {
                    oddSum += a[i][j];
                }
            }
        }

        // Print the sums
        System.out.print(evenSum+" ");
        System.out.print(oddSum+" ");
    }
}
