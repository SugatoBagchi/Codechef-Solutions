/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SDICE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0)
		{
		    long N = Long.parseLong(br.readLine()), sum = 0;
		    if(N==1)
		    sum = sum + 20;
		    else if(N==2)
		    sum = sum + 36;
		    else if(N==3)
		    sum = sum + 51;
		    else if(N==4)
		    sum = sum + 60;
		    else if(N==5)
		    sum = sum + 76;
		    else if(N==6)
		    sum = sum + 88;
		    else if(N==7)
		    sum = sum + 99;
		    else if(N==8)
		    sum = sum + 104;
		    else if(N>8)
		    {
                if(N%4==1)
                sum = (long) 104 + (long) (N/4-2)*44 + 16;
                else if(N%4==2)
                sum = (long) 104 + (long) (N/4-2)*44 + 28;
                else if(N%4==3)
                sum = (long) 104 + (long) (N/4-2)*44 + 39;
                else if(N%4==0)
                sum = (long) 104 + (long) (N/4-2)*44;
		    }
			System.out.println(sum);
		}
	}
}
