import java.util.*;

public class patt16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = 2 * n - 3;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            // star loop
            for (int j = 1; j <= star; j++) {
                System.out.print(count + "	");
                count++;
            }
            // space loop
            for (int j = 1; j <= space; j++) {
                System.out.print("	");
            }
            // star loop
            if (i == n) {
                star--;
                count--;
            }
            for (int j = 1; j <= star; j++) {
                count--;
                System.out.print(count + "	");

            }
            star++;
            space -= 2;

            System.out.println();
        }

    }
}
