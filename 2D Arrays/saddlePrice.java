import java.io.*;
import java.util.*;

public class saddlePrice {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for (int r = 0; r < n; r++) {
            int minc = 0;
            for (int c = 1; c < n; c++) {
                if (a[r][minc] > a[r][c]) {
                    minc = c;
                }
            }
            boolean isMax = true;
            for (int row = 0; row < n; row++) {
                if (a[r][minc] < a[row][minc]) {
                    isMax = false;
                    break;
                }

            }
            if (isMax) {
                System.out.println(a[r][minc]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}