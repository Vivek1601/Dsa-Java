import java.io.*;
import java.util.*;

public class swapOfArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println("Before Swap !!!");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
        swap(a);
        System.out.println("After Swap !!!");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
    }

    public static void swap(int[] b) {
        int left = 0;
        int right = b.length - 1;
        while (left <= right) {
            int temp = b[left];
            b[left] = b[right];
            b[right] = temp;
            left++;
            right--;
        }
    }
}
