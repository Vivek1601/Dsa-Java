import java.io.*;
import java.util.*;

public class findElementInArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int toFind = scn.nextInt();
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == toFind) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}