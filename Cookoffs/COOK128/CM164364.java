/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CM164364 
{
    public static void main(String[] args) throws java.lang.Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt(), x = sc.nextInt(), pos=1;
            int A[] = new int[n], B[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                A[i]=sc.nextInt();
            }
            Arrays.sort(A);
            for(int i = 0; i < n-1;i++)
            {
               if(A[i]!=A[i+1])
               {
                    B[(pos-1)]=A[i]; 
                    pos++;
               }
            }
            
            if(pos<(n-x))
            System.out.println(pos);
            else
            System.out.println(n-x);
        }
    }
}
