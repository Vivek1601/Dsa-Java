import java.io.*;
import java.util.*;

public class toggleCase {

    public static String toggleCase(String str) {
        // StringBuilder sb= new StringBuilder();
        // int diff = 'a'-'A';
        // for(int i=0;i<str.length();i++){
        // char ch = str.charAt(i);
        // if(ch>='A' && ch<='Z'){
        // // upper->lower
        // ch = (char)(ch+diff);
        // }else{
        // // >lower->upper
        // ch = (char)(ch-diff);
        // }
        // sb.append(ch);
        // }

        // return sb.toString();
        // }
        // or 2nd method
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // upper->lower
                ch = (char) (ch + 'a' - 'A');
            } else {
                // >lower->upper
                ch = (char) (ch - 'a' + 'A');
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}