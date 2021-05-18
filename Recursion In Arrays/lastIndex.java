import java.io.*;
import java.util.*;

public class lastIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int lastindex = lastIndex(arr, 0, x);
        System.out.println(lastindex);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (arr.length == idx)
            return -1;
        int faithIndex = lastIndex(arr, idx + 1, x);
        if (faithIndex != -1) {
            return faithIndex;
        }
        if (arr[idx] == x)
            return idx;
        return -1;
    }

}