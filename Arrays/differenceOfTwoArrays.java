import java.io.*;
import java.util.*;

public class differenceOfTwoArrays {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();

        }
        int sizeOfDiff = n2;
        int diff[] = new int[sizeOfDiff];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        int carry = 0;
        while (i >= 0) {
            a2[j] += carry;
            if (a2[j] < a1[i]) {
                carry = -1;
                diff[k] = a2[j] + 10 - a1[i];
            } else {
                diff[k] = a2[j] - a1[i];
                carry = 0;
            }
            i--;
            j--;
            k--;
        }
        while (k >= 0) {
            diff[k] = a2[j] + carry;
            carry = 0;
            j--;
            k--;
        }

        int idx = 0;
        for (int p = 0; p < diff.length; p++) {
            if (diff[p] != 0) {
                idx = p;
                break;
            }
        }
        for (int p = idx; p < diff.length; p++) {
            System.out.println(diff[p]);
        }
    }
}