import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    // writing the function for reversing Number using recursion
    
    public static void recurssion(int num){
        // handling base case:
        if(num == 0){
            return;
        }
        
        
       System.out.print(num % 10);
       
       recurssion(num / 10);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num = 54321;
	     recurssion(num);
// 		System.out.println(reverse);

	}
}
