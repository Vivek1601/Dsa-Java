import java.io.*;
import java.util.*;

public class stateOfWakanda2(diagonalTraversal)
{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for (int g = 0; g < a.length; g++) {
            int i = 0;
            int j = g;
            while (j < a.length) {
                System.out.println(a[i][j]);
                i++;
                j++;
            }
        }
    }

}