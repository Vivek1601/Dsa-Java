import java.io.*;
import java.util.*;

public class stateOfWakanda1 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 00,01,...0m-1, 10,11....1m-1;
                a[i][j] = scn.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                // 0 ... n-1
                for (int i = 0; i < n; i++) {
                    System.out.println(a[i][j]);
                }
            } else {
                // n-1 ...0
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(a[i][j]);
                }
            }

        }
    }

}