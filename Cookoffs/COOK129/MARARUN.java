/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(br.readLine());
		while(T-->0)
		{
		    String[] first = br.readLine().split(" ");
		    int D=Integer.parseInt(first[0]), d=Integer.parseInt(first[1]), a=Integer.parseInt(first[2]), b=Integer.parseInt(first[3]), c=Integer.parseInt(first[4]);
		    if(D*d < 10)
		        System.out.println(0);
		    else if(D*d <21 && D*d >=10)
		        System.out.println(a);
		    else if(D*d <42 && D*d >=21)
		        System.out.println(b);
		    else if(D*d>=42)
		        System.out.println(c);
		    
		}
	}
}
