/*
    This is a partially accepted solution.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ISS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		long T = Long.parseLong(br.readLine());
		while(T-->0)
		{
		    int k = Integer.parseInt(br.readLine());
		    long sum=0;
		    for(int i = 1; i < (2*k)+1; i++)
		    {
		        long a = k + (i*i);
		        long b = k + ((i+1)*(i+1));
		        //for(int j = i+1; j<=(2*k)+1; j++)
		        //{
		            //System.out.println(a + " " + b);
		            sum = sum + gcd(a,b);
		        //}
		    }
		    System.out.println(sum);
		}
	}
	
	static long gcd(long i, long j)
	{
	    if(i%j==0)
	        return j;
	    return gcd(j,i%j);
	}
}
