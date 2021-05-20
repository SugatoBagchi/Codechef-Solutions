/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class XOREQUAL {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {

            long a = 2, N = Long.parseLong(br.readLine()) - 1, m = 1000000007, xor = 1;
            if (N == 0) {
                System.out.println(xor);
            }
            while (N > 0) {
                a = a % m;
                if (a == 0)
                    xor = 1;
                while (N > 0) {
                    if ((N & 1) != 0)
                        xor = (xor * a) % m;
                    N = N >> 1;
                    a = (a * a) % m;
                }
                System.out.println(xor);
            }
        }
    }
}