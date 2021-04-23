import java.util.*;

public class patt3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            // space loop
            for (int j = 1; j <= spaces; j++) {
                System.out.print("	");
            }
            // star loop
            for (int j = 1; j <= stars; j++) {
                System.out.print("*	");
            }
            stars++;
            spaces--;
            System.out.println();

        }

    }
}
