
import java.util.*;

public class printAllPrimesTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {

            Boolean isPrime = true;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }
}