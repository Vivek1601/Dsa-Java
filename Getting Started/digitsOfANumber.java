import java.util.*;

public class digitsOfANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int length = 0;
        while (temp != 0) {
            temp = temp / 10;
            length++;
        }
        while (length != 0) {
            int digitOfANumber = n / (int) Math.pow(10, length - 1);
            System.out.println(digitOfANumber);
            n = n % (int) Math.pow(10, length - 1);
            length--;

        }
    }
}