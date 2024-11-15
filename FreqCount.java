import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static String freqCount(String str){
        int[] arr = new int[26];
        for(int i=0;i<str.length(); i++){
            arr[str.charAt(i) - 'a'] += 1;
        }
        
        String ans = "";
        for(int i=0; i<26; i++){
            if(arr[i] != 0){
                char ch = (char)(i + 97);
                ans = ans + ch;
                ans += Integer.toString(arr[i]);
            }
        }
        
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "abbcdd";
		int n = str.length();
		
		String ans = freqCount(str);
		System.out.println(ans);

	}
}
