/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PSGRADE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int Am = sc.nextInt(),Bm = sc.nextInt();
		    int Cm = sc.nextInt(),Tm = sc.nextInt();
		    int A= sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		    
		    if(A>= Am && B>=Bm && C>=Cm && (A+B+C)>=Tm)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
		
	}
}
