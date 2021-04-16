import java.util.*;

public class rotateANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int length = 0;
        while (temp != 0) {
            temp = temp / 10;
            length++;
        }
        k = k % length;
        if (k < 0) {
            k = k + length;
        }
        int rem = n % (int) Math.pow(10, k);
        int quo = n / (int) Math.pow(10, k);
        int value = rem * (int) Math.pow(10, length - k) + quo;
        System.out.println(value);
    }
}