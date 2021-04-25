/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HIRETEST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(), F = 0, P=0;
		    String arr[] = new String[N];
		    String output = "";
		    char k = ' ';
		    for(int i = 0; i < N; i++)
		    {
		        arr[i] = sc.next();
		    }
		    for(int i = 0; i < N; i++)
		    {
		        for(int j = 0; j < M; j++)
		        {
		            k = arr[i].charAt(j);
		            if(k == 'F')
		            F++;
		            else if(k == 'P')
		            P++;
		        }
		        if(F>=X)
		        output= output + "1";
		        else if(F==(X-1) && (P>=Y))
		        output= output + "1";
		        else 
		        output = output + "0";
		        F = 0;
		        P = 0;
		    }
		    System.out.println(output);
		}
	}
}
