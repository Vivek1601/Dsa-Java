import java.io.*;
import java.util.*;

public class printKPC {
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz", };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        printKPC(scn.nextLine(), "");
    }

    public static void printKPC(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
        int index = str.charAt(0) - '0';
        String code = codes[index];
        String fs = str.substring(1);
        for (int i = 0; i < code.length(); i++) {
            char cod = code.charAt(i);
            printKPC(fs, asf + cod);
        }
    }

}