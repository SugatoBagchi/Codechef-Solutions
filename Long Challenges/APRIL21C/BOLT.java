/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BOLT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            double k1 = sc.nextDouble(), k2 = sc.nextDouble(), k3 = sc.nextDouble(), v = sc.nextDouble();
            double finalspeed = (double) k1*k2*k3*v;
            double time = (double) 100/finalspeed;
            time = (double) Math.round(time*100)/100;

            if(time<9.58)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
	}
}