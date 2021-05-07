import java.io.*;
import java.util.*;

public class spiralDisplay {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int rmin = 0;
        int cmin = 0;
        int rmax = n - 1;
        int cmax = m - 1;

        int t = n * m;
        int d = 0;
        while (d < t) {
            for (int r = rmin; r <= rmax; r++) {
                System.out.println(a[r][cmin]);
                d++;
            }
            for (int c = cmin + 1; c <= cmax; c++) {
                System.out.println(a[rmax][c]);
                d++;
            }
            if (d == t) {
                break;
            }
            for (int r = rmax - 1; r >= rmin; r--) {
                System.out.println(a[r][cmax]);
                d++;
            }

            for (int c = cmax - 1; c >= cmin + 1; c--) {
                System.out.println(a[rmin][c]);
                d++;
            }
            rmin++;
            rmax--;
            cmin++;
            cmax--;
        }
    }

}