import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int helper(String str, int n){
        int rem = 0;
        for(int i=0; i<n; i++){
            int num = rem * 10 + str.charAt(i) - '0';
            rem = num % 11;
        }
        
        return rem;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "1345";
		int n = str.length();
		
		int ans = helper(str, n);
		System.out.println(ans);

	}
}
