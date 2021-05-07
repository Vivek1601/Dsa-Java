import java.io.*;
import java.util.*;

public class twoDArraysDemo {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int a[][] = new int[n][m];
        // how to take input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 00,01,...0m-1, 10,11....1m-1;
                a[i][j] = scn.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}