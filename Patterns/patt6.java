import java.util.*;

public class patt6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = n / 2 + 1;
        int spaces = 1;
        for (int i = 1; i <= n; i++) {
            // star loop
            for (int j = 1; j <= stars; j++) {
                System.out.print("*	");
            }
            // space loop
            for (int j = 1; j <= spaces; j++) {
                System.out.print("	");
            }
            // star loop
            for (int j = 1; j <= stars; j++) {
                System.out.print("*	");
            }
            if (i <= n / 2) {
                spaces += 2;
                stars--;
            } else {
                spaces -= 2;
                stars++;
            }
            System.out.println();
        }
    }
}