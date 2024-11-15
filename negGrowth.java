import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
   public static int negativeGrowth(int n, int[] arr){
       if(n==0 || n==1) return 0;
       int count = 0;
       for(int i=1; i<n; i++){
           if(arr[i] < arr[i-1]){
               count++;
           }
       }
       
       return count;
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 5;
		int[] arr = {5,4,3,2,1};
		
		int result = negativeGrowth(n, arr);
		System.out.println(result);

	}
}
