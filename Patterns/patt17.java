import java.util.*;

public class patt17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = n / 2;
        for (int i = 1; i <= n; i++) {

            // space loop
            for (int j = 1; j <= space; j++) {

                System.out.print("	");

            }
            // star loop

            for (int j = 1; j <= star; j++) {
                if ((i > 1 && i < n / 2 + 1) || (i > n / 2 + 1 && i < n)) {
                    if (j <= star / 2) {
                        System.out.print("	");
                    } else {
                        System.out.print("*	");
                    }
                } else {
                    System.out.print("*	");
                }
            }
            if (i <= n / 2) {
                star += 2;
                space--;
            } else {
                space++;
                star -= 2;
            }

            System.out.println();
        }

    }
}