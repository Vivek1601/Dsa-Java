import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class k
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int T = scn.nextInt();
		int N =  scn.nextInt();
		int K = scn.nextInt();
		int A [] = new int[N];
		for(int i=0;i<N;i++){
		    A[i] = scn.nextInt();
		    
		}
		int B [] = new int [K*N];
		for(int i=0;i<N;i++){
		    B[i]=   K* A[i];}
		}
		public static void max(int [] B){
		int max =B[0]+B[1];
		int i=2;
		if(B[i]+B[i+1]>max){
		    max = B[i]+B[i+1];
		    i++;
		}
		}
		public static void subarray(int [] B, int max){
		    for(int s=0;s<N;s++){
		        for(int e=s;e<N;e++){
		            for(int i=s;i<=e;i++){
		               System.out.println(max);
		            }
		            }
		        }
		    }
		}
	}
}

