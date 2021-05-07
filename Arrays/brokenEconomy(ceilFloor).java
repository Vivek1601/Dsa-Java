import java.io.*;
import java.util.*;

public class brokenEconomy(ceilFloor){

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int [] a = new int[n];
    for(int i=0;i<n;i++){
       a[i]= scn.nextInt();
    }
    
    int i=0;
    int j = n-1;
    int d = scn.nextInt();
    int ceil= 0;
    int floor=0;
    while(i<=j){
       int mid = (i+j)/2;
        if(a[mid]<d){
            floor = a[mid];
            i= mid+1;
        }else if(a[mid]>d){
            ceil = a[mid];
            j= mid-1;
        }else{
            ceil=floor=a[mid];
            break;
        }
    }
     System.out.println(ceil);
     System.out.println(floor);

 }

}