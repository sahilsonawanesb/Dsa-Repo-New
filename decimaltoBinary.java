import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    // writing the recurssion code for converting decimal number into the binary code..
    public static void recursion(int num){
        
        // handling base case:
        if(num == 0){
            return;
        }
        
        recursion(num/2);
        
        System.out.print(num%2);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num = 6;
	    recursion(num);
		
		

	}
}
