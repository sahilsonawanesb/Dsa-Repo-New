import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String removeX(String str){
        
        if(str.length() == 0){
            return str;
        }
        
        String smallOutput = removeX(str.substring(1));
        if(str.charAt(0) == 'x'){
            return smallOutput;
        }else{
            return str.charAt(0) + smallOutput;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.print(removeX("abxcxdx"));

	}
}
