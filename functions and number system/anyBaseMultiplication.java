import java.util.*;

public class anyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);

    }

    public static int getProduct(int b, int n1, int n2) {
        int finalValue = 0;
        int pow = 1;

        while (n2 != 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int singleDigitProduct = getSingleDigitProduct(b, n1, d2);
            singleDigitProduct = singleDigitProduct * pow;
            finalValue = anyBaseAddition(b, finalValue, singleDigitProduct);
            pow = pow * 10;
        }
        return finalValue;

    }

    public static int anyBaseAddition(int b, int n1, int n2) {

        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int digit = digit1 + digit2 + carry;
            // now update carry also

            carry = digit / b;
            digit = digit % b;
            ans = ans + digit * pow;
            pow = pow * 10;

        }
        return ans;
    }

    public static int getSingleDigitProduct(int b, int n1, int d2) {
        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n1 != 0 || carry != 0) {
            int dig1 = n1 % 10;
            n1 = n1 / 10;
            int digit = d2 * dig1 + carry;
            carry = digit / b;
            digit = digit % b;
            ans = ans + digit * pow;
            pow = pow * 10;
        }
        return ans;
    }

}