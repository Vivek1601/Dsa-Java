import java.util.*;

public class patt4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = n;
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            // spaces loop
            for (int j = 1; j <= spaces; j++) {
                System.out.print("	");

            }
            // stars loop
            for (int j = 1; j <= stars; j++) {
                System.out.print("*	");

            }

            stars--;
            spaces++;
            System.out.println();
        }

    }
}