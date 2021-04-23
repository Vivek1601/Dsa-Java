import java.util.*;

public class patt14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int a = 1; a <= 10; a++) {
            int mult = n * a;
            System.out.println(n + " * " + a + " = " + mult);

        }

    }
}