import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
   
   public static String removeConsDupli(String str){
    //   handling base case as follows..
    if(str.length() <= 1){
        return str;
    }
    
    String smallOutput = removeConsDupli(str.substring(1));
    if(str.charAt(0) == str.charAt(1)){
        return smallOutput;
    }else{
        return str.charAt(0) + smallOutput;
    }
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.print(removeConsDupli("abbccd"));

	}
}
