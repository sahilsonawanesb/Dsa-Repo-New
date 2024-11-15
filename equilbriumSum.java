import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
  public static int equib(int[] arr, int n){
      int left = 0;
      int right = 0;
      
      for(int i=0; i<n; i++){
          right += arr[i];
      }
      
      for(int i=0; i<n; i++){
          right -= arr[i];
          if(right == left) return i;
          left = left + arr[i];
      }
      
      return -1;
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		int n = arr.length;
		
		int result = equib(arr, n);
		System.out.println(result);

	}
}
