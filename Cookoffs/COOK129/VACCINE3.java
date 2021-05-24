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
		Scanner sc = new Scanner(System.in);
		long T = Long.parseLong(br.readLine());
		while(T-->0)
		{
		    String[] line = br.readLine().split(" ");
		    int G = Integer.parseInt(line[0]), p = Integer.parseInt(line[1]), max=0, min=0;
		    int[] X = new int[10];
		    for(int i = 0; i<10; i++)
		    {
		        X[i] = Integer.parseInt(line[i+2]);
		    }
		    for(int i = 9; i >=G-1; i--)
		    {
		        if(i<G)
		            max+=X[i];
		        else{
		            max+=X[i];
		            min+=X[i];
		        }
		    }
		    min=(min/p) + 1;
		    if(max%p!=0)
		        max=(max/p) + 1;
		    else
		        max=max/p;
		        
		    System.out.println(min + " " + max);
		}
	}
}
