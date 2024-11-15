import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static String charReplace(String str, char ch1, char ch2){
        StringBuilder newStr = new StringBuilder();
        
        if(str == null || str.isEmpty()) return str;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == ch1){
                newStr.append(ch2);
            }else if(ch == ch2){
                newStr.append(ch1);
            }else{
                newStr.append(ch);
            }
        }
        
        return newStr.toString();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "apples";
		char ch1 = 'a';
		char ch2 = 'p';
		
		String res = charReplace(str, ch1, ch2);
		System.out.println(res);

	}
}
