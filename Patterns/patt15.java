import java.util.*;

public class patt15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = n / 2;
        int count = 1;

        for (int i = 1; i <= n; i++) {

            // space loop
            for (int j = 1; j <= space; j++) {
                System.out.print("	");

            }
            // star loop
            int countcopy = count;
            for (int j = 1; j <= star; j++) {

                System.out.print(countcopy + "	");
                if (j <= star / 2) {
                    countcopy++;

                } else {
                    countcopy--;
                }
            }

            if (i <= n / 2) {
                space--;
                star += 2;
                count++;
            } else {
                star -= 2;
                space++;
                count--;
            }
            System.out.println();
        }

    }
}
