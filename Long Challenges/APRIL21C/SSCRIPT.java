/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SSCRIPT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int len = sc.nextInt(), K=sc.nextInt(), count = 0;
            String S = sc.next();
            //boolean check = false;
            for(int i = 0; i < len; i++)
            {
                if(S.charAt(i) == '*')
                {
                    count++;
                    if(count==K)
                    {
                        System.out.println("YES");
                        break;
                    }
                }
                else
                count=0;
            }
                if(count!=K)
                System.out.println("No");
        }
    }
}