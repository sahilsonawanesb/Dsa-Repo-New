import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static String helper(String str, int n){
        int sum = 0;
        String ans = "";
        for(int i=1; i<str.length(); i+=2){
            
            sum = sum + str.charAt(i) - '0';
            
            if(sum >= n){
                ans = ans + str.charAt(i-1);
                return ans;
            }
        }
        
        return "-1";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "a2b2c2d1";
		int n = 5;
		
		String ans = helper(str, n);
		System.out.println(ans);

	}
}
