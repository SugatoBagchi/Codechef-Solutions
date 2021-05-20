/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int N = Integer.parseInt(firstLine[0]), x = Integer.parseInt(firstLine[1]),
                    k = Integer.parseInt(firstLine[2]);
            if (x % k == 0 || ((N + 1) - x) % k == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
