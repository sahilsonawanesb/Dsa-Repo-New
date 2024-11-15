import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int smallestEleOccurence(int[] arr, int n){
        int smallestElement = 0;
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[i+1]){
                smallestElement = arr[i];
                break;
            }
        }
        
        
        // finding the occurence of the smallest element in an array
        int occurence = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == smallestElement){
                occurence++;
            }
        }
        
        return occurence;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {1,2,3,4,4,5,5,5};
		int n = arr.length;
		
		int result = smallestEleOccurence(arr, n);
		System.out.println(result);

	}
}
