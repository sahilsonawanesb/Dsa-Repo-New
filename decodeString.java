import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String decodeString(String str){
        int n = str.length();
        int count = 0;
        
        String res = "";
        
        for(char c : str.toCharArray()){
            // handling all edge cases..
            if(c == '0' && count == 0){
                count = 0;
            }else if(c == '0' && count > 0){
                res += (char)('A' + count - 1);
                count = 0;
            }else{
                count++;
            }
        }
        
        if(str.charAt(n-1) == '1'){
            res += (char)('A' + count - 1);
        }
        
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "11101011110";
		String ans = decodeString(str);
		System.out.println(ans);

	}
}
