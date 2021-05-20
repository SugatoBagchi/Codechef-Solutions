/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CCHEAVEN {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int L = sc.nextInt(), temp, life = 0, flag = 0;
            String s = sc.next();
            char k = ' ';

            for (int i = 0; i < L; i++) {
                k = s.charAt(i);
                temp = Character.getNumericValue(s.charAt(i));
                if (temp == 1)
                    life++;

                if ((life * 100) / (i + 1) >= 50) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
