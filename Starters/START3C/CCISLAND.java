/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CCISLAND
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int x=sc.nextInt(), y=sc.nextInt(), xr=sc.nextInt(), yr=sc.nextInt(), D=sc.nextInt();
		    double min;
		    if((double) x/xr < y/yr)
		    min = (double) x/xr;
		    else
		    min = (double) y/yr;
		    if(min >= (D))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    
		}
	}
}
