import java.io.*;
import java.util.*;

public class inverseOfAnArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    // public static int[] inverse(int[] a){
    // int n = a.length;

    // int [] inv =new int[n];
    // for(int i=0;i<n;i++){
    // int d = a[i];
    // int id = i;
    // int ii = d;
    // inv [ii] = id;
    // }

    // return inv;
    // }
    public static int[] inverse(int[] a) {
        int n = a.length;

        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            inv[a[i]] = i;
        }

        return inv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}