import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String replaceChar(String str, char a, char b){
        
        // solving using recurssion as follows..
        if(str.length() == 0){
            return str;
        }
        
        String smallOutput = replaceChar(str.substring(1), a, b);
        if(str.charAt(0) == a){
            return b + smallOutput;
        }else{
            return str.charAt(0) + smallOutput;
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.print(replaceChar("abxcxdx", 'x', 'y'));

	}
}
