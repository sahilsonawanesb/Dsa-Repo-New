import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
  public static int maxBarrier(int n, int[][] arr){
      
      int[][] points = new int[n][2];
      for(int i=0; i<n; i++){
          points[i][0] = 0;
          points[i][1] = 0;
      }
      
        // step2: finding the starting and lastindex of an barrier.
        
        for(int i=0; i<n; i++){
            points[i][0] = arr[i][0];
            points[i][1] = arr[i][0] + arr[i][2];
        }
        
        // step3: count the total number of people blocks..
        int totalpeopleblocked = 0;
        int startx = points[0][0];
        int endx = points[0][0];
        
        for(int i=0; i<n; i++){
            if(points[i][0] < points[i-1][1]){
                endx = points[i][1];
            }else{
                // total people blocked calculating simulatously
                totalpeopleblocked += endx - startx + 1;
                startx = points[i][0];
                endx = points[i][1];
            }
        }
        totalpeopleblocked += endx - startx + 1;
        
        return totalpeopleblocked;
        
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
// 		String str = "abbcdd";
// 		int n = str.length();
		
// 		String ans = freqCount(str);
// 		System.out.println(ans);
        int n = 5;
        int[][] arr = new int[n][3];
        for(int i=0; i<n)
        int res = maxBarrier(n, arr);
        System.out.println(res);
	}
}
