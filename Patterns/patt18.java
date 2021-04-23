import java.util.*;

public class patt18 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = n;
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("	");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > 1 && i < (n / 2) + 1 && j > 1 && j < stars) {
                    System.out.print("	");
                } else {
                    System.out.print("*	");
                }
            }

            if (i <= n / 2) {
                stars -= 2;
                spaces++;
            } else {
                stars += 2;
                spaces--;
            }
            System.out.println();

        }

    }
}
