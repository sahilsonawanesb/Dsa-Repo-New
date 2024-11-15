import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
   public static String replacePi(String str){
    //   handling base case..
    if(str.length() <= 1){
        return str;
    }
    
    if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
        
        String smallOutput = replacePi(str.substring(2));
        return "3.14" + smallOutput;
    }else{
        String smallOutput = replacePi(str.substring(1));
        return str.charAt(0) + smallOutput;
    }
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.print(replacePi("abpipi"));

	}
}
