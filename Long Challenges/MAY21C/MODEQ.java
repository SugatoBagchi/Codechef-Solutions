/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class MODEQ {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            long N = Long.parseLong(firstLine[0]), count = N - 1;
            int M = Integer.parseInt(firstLine[1]);
            long[] arr = new long[(int) N + 1];
            Arrays.fill(arr, 0);
            for (int i = 2; i <= N; i++) {
                count += arr[M % i];
                for (int j = M % i; j <= N; j += i) {
                    arr[j] += 1;
                }
            }
            System.out.println(count);

        }
    }
}