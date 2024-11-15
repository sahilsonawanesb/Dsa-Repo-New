import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int minMaxSum(int[] arr, int n){
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        
        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        
        return smallest + largest;
    }
    
  
	public static void main (String[] args) throws java.lang.Exception
	{   
	    
	    int n = 5;
	    int[] arr = {1,5,2,4,3};
	    
	    int result = minMaxSum(arr, n);
	    System.out.print(result);
	    
	    
	}
}
