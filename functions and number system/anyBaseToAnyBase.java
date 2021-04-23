import java.util.*;

public class anyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int decimalValue = anyBaseToDecimal(n, sourceBase);
        int destinationValue = decimalToAnyBase(decimalValue, destBase);
        System.out.println(destinationValue);
    }

    public static int anyBaseToDecimal(int n, int sourceBase) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n % 10;
            ans = ans + rem * pow;
            n = n / 10;
            pow = pow * sourceBase;
        }
        return ans;
    }

    public static int decimalToAnyBase(int n, int destBase) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n % destBase;
            ans = ans + rem * pow;

            pow = pow * 10;
            n = n / destBase;
        }
        return ans;

    }
}