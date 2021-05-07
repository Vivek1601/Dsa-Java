import java.io.*;
import java.util.*;

public class exitPointMatrix {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        // e 0;w
        int dir = 0;
        while (true) {
            if (a[i][j] == 1) {
                dir++;
                if (dir == 4) {
                    dir = 0;
                }
            }
            if (dir == 0) {
                if (j == m - 1) {
                    break;
                }
                j++;
            }
            if (dir == 1) {
                if (i == n - 1) {
                    break;
                }
                i++;
            }
            if (dir == 2) {
                if (j == 0) {
                    break;
                }
                j--;
            }
            if (dir == 3) {
                if (i == 0) {
                    break;
                }
                i--;
                ;
            }
        }
        System.out.println(i);
        System.out.println(j);

    }

}