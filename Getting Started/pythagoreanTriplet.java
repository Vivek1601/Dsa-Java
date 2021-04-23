import java.util.*;

public class pythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max == a) {
            boolean pyth = (a * a == b * b + c * c);
            System.out.println(pyth);
        } else if (max == b) {
            boolean pyth = (b * b == a * a + c * c);
            System.out.println(pyth);
        } else {
            boolean pyth = (c * c == a * a + b * b);
            System.out.println(pyth);
        }
    }
}
