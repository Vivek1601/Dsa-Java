import java.util.*;

public class inverseOfANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int originalValue = scn.nextInt();
        int inverseValue = 0;
        int inverseValueDigit = 1;
        while (originalValue != 0) {
            int postionOfInverseValue = originalValue % 10;
            inverseValue = inverseValue + inverseValueDigit * (int) Math.pow(10, postionOfInverseValue - 1);
            inverseValueDigit++;
            originalValue = originalValue / 10;

        }
        System.out.println(inverseValue);
    }
}