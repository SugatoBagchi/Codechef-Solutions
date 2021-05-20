/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EQUINOX {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
            long sar = 0, anu = 0;
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                char k = ' ';

                k = s.charAt(0);
                if (k == 'E' || k == 'Q' || k == 'U' || k == 'I' || k == 'O' || k == 'N' || k == 'X')
                    sar = sar + A;
                else
                    anu = anu + B;

            }
            if (sar > anu)
                System.out.println("SARTHAK");
            else if (anu > sar)
                System.out.println("ANURADHA");
            else
                System.out.println("DRAW");
            anu = 0;
            sar = 0;

        }
    }
}