import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
   
   public static int binarySearch(int[] a, int si, int ed, int x){
    //   handling base case as follows..
        if(si > ed){
            return -1;
        }
        
        int midIndex = (si+ed)/2;
        if(a[midIndex] == x){
            return midIndex;
        }else if(a[midIndex] < x){
            return binarySearch(a, midIndex + 1, ed, x);
        }else{
            return binarySearch(a, si, midIndex - 1, x);
        }
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {1,2,3,4,5,6};
		System.out.print(binarySearch(a,0,a.length-1, 5));

	}
}
