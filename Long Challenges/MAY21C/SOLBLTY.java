/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SOLBLTY
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(br.readLine());
		while(T-->0)
		{
		    String[] ARR = br.readLine().split(" ");
		    int X= Integer.parseInt(ARR[0]), A = Integer.parseInt(ARR[1]), B = Integer.parseInt(ARR[2]), sol = 0;
		    sol = A + (100-X)*B;
		    sol = sol *10;
		    System.out.println(sol);
		}
	}
}
