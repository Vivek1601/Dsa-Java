import java.util.*;

public class gcdAndLcm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n1Copy = n1;
        int n2Copy = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        int gcd = n2;

        int lcm = n1Copy * n2Copy / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
// import java.util.*;

// public class Main{

// public static void main(String[] args) {
// Scanner scn = new Scanner (System.in);
// int num1= scn.nextInt();
// int num2= scn.nextInt();
// int num1Copy = num1;
// int num2Copy = num2;
// while(num1%num2!=0){
// int rem = num1%num2;
// num1=num2;
// num2=rem;

// }
// int gcd = num2;

// System.out.println(gcd);
// int lcm=num1Copy;
// while(true){

// if((lcm%num1Copy==0 && lcm%num2Copy==0)){
// System.out.println(lcm);
// break;
// }

// lcm++;

// }

// }
// }
// import java.util.*;

// public class Main{

// public static void main(String[] args) {
// Scanner scn = new Scanner (System.in);
// int num1= scn.nextInt();
// int num2= scn.nextInt();
// int num1Copy = num1;
// int num2Copy = num2;
// while(num1%num2!=0){
// int rem = num1%num2;
// num1=num2;
// num2=rem;

// }
// int gcd = num2;

// System.out.println(gcd);
// int lcm=num1Copy;
// while(!(lcm%num1Copy==0 && lcm%num2Copy==0)){

// // if(){
// // System.out.println(lcm);
// // break;
// // }

// lcm++;

// }
// System.out.println(lcm);

// }
// }