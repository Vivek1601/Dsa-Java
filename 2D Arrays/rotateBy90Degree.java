import java.io.*;
import java.util.*;

public class rotateBy90Degree {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for (int i = 1; i < n; i++) {
            int j = 0;
            while (i != j) {
                // swap i,j j,1
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
                j++;
            }
        }
        for (int r = 0; r < n; r++) {

            int i = 0;
            int j = n - 1;
            while (i < j) {
                int t = a[r][i];
                a[r][i] = a[r][j];
                a[r][j] = t;
                i++;
                j--;
            }
        }
        display(a);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}