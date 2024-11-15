import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static void segEvenandOdd(int n, int[] arr){
        
        int left = 0;
        int right = n - 1;
        
        while(left < right){
            if(arr[left] % 2 != 0){
                // then swap left and right..
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }else{
                left++;
            }
        }
        
        return;
    }
    
  
	public static void main (String[] args) throws java.lang.Exception
	{   
	    
	    int n = 5;
	    int[] arr = {1,5,2,4,3};
	    
	    
	    segEvenandOdd(n, arr);
	    
	    for(int i=0; i<n; i++){
	        System.out.print(arr[i] + " ");
	    }
	}
}
