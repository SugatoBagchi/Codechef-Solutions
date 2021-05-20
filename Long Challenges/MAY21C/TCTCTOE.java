/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TCTCTOE {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(br.readLine());
		while (T-- > 0) {
			int countx = 0, counto = 0, countdash = 0, winx = 0, wino = 0;
			String TTT[][] = new String[3][3];
			String[] A = br.readLine().split("");
			TTT[0][0] = A[0];
			TTT[0][1] = A[1];
			TTT[0][2] = A[2];
			
			if(A[0].equals("X")){countx++;}else if(A[0].equals("O")){counto++;}
			else if(A[0].equals("_")){countdash++;}
			if(A[1].equals("X")){countx++;}else if (A[1].equals("O")){counto++;}
			else if(A[1].equals("_")){countdash++;}
			if(A[2].equals("X")){countx++;}else if (A[2].equals("O")){counto++;}
			else if (A[2].equals("_")){countdash++;}
			
			A = br.readLine().split("");
			TTT[1][0] = A[0];
			TTT[1][1] = A[1];
			TTT[1][2] = A[2];
			
			if(A[0].equals("X")){countx++;}else if(A[0].equals("O")){counto++;}
			else if(A[0].equals("_")){countdash++;}
			if(A[1].equals("X")){countx++;}else if (A[1].equals("O")){counto++;}
			else if(A[1].equals("_")){countdash++;}
			if(A[2].equals("X")){countx++;}else if (A[2].equals("O")){counto++;}
			else if (A[2].equals("_")){countdash++;}
			
			A = br.readLine().split("");
			TTT[2][0] = A[0];
			TTT[2][1] = A[1];
			TTT[2][2] = A[2];
			
			if(A[0].equals("X")){countx++;}else if(A[0].equals("O")){counto++;}
			else if(A[0].equals("_")){countdash++;}
			if(A[1].equals("X")){countx++;}else if (A[1].equals("O")){counto++;}
			else if(A[1].equals("_")){countdash++;}
			if(A[2].equals("X")){countx++;}else if (A[2].equals("O")){counto++;}
			else if (A[2].equals("_")){countdash++;}
			
			if(!TTT[0][0].equals("_") && TTT[0][0].equals(TTT[1][1]) && TTT[1][1].equals(TTT[2][2])){if(TTT[0][0].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[2][0].equals("_") && TTT[2][0].equals(TTT[1][1]) && TTT[1][1].equals(TTT[0][2])){if(TTT[2][0].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[0][0].equals("_") && TTT[0][0].equals(TTT[1][0]) && TTT[1][0].equals(TTT[2][0])){if(TTT[2][0].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[0][1].equals("_") && TTT[0][1].equals(TTT[1][1]) && TTT[1][1].equals(TTT[2][1])){if(TTT[2][1].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[0][2].equals("_") && TTT[0][2].equals(TTT[1][2]) && TTT[1][2].equals(TTT[2][2])){if(TTT[2][2].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[0][0].equals("_") && TTT[0][0].equals(TTT[0][1]) && TTT[0][1].equals(TTT[0][2])){if(TTT[0][0].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[1][0].equals("_") && TTT[1][0].equals(TTT[1][1]) && TTT[1][1].equals(TTT[1][2])){if(TTT[1][0].equals("X")){winx=1;}else{wino=1;}}
			if(!TTT[2][0].equals("_") && TTT[2][0].equals(TTT[2][1]) && TTT[2][1].equals(TTT[2][2])){if(TTT[2][0].equals("X")){winx=1;}else{wino=1;}}
			
			if((countx==counto || countx == counto+1) && winx ==0 && wino ==0  && countdash >0)
			    System.out.println(2);
			    

    		else if(((countx-1==counto) && (countdash==0) && (winx==0) && (wino==0)) || ((countx-1==counto) && wino==0 && winx==1) || ((countx == counto) && wino==1 && winx==0))
    		    System.out.println(1);
    		    
    		else
    		    System.out.println(3);

		}
	}
}
