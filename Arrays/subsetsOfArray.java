import java.io.*;
import java.util.*;

public class subsetsOfArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scn.nextInt();
        }
        int total = (int) Math.pow(2, n);
        for (int deci = 0; deci < total; deci++) {
            int bin = d2b(deci);
            // binary to set
            int div = (int) Math.pow(10, n - 1);
            for (int i = 0; i < n; i++) {
                int bit = bin / div;
                if (bit == 0) {
                    System.out.print("-	");
                } else {
                    System.out.print(ar[i] + "	");
                }
                bin = bin % div;
                div = div / 10;
            }
            System.out.println();
        }
    }

    public static int d2b(int d) {
        int rv = 0;

        int pow = 1;
        while (d != 0) {
            int dig = d % 2;
            d = d / 2;
            rv += dig * pow;
            pow = pow * 10;
        }
        return rv;

    }

}