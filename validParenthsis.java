import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static boolean validPar(String str){
        int l = str.length();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<l;i++){
            
        if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
            }else{
                
                if(str.isEmpty()){
                    return false;
                }
                
                if(str.charAt(i) == ')'){
                    if(st.peek() != '('){
                        return false;
                    }
                }
                
                if(str.charAt(i) == '}'){
                    if(st.peek() != '{'){
                        return false;
                    }
                }
                
                if(str.charAt(i) == ']'){
                    if(st.peek() != '['){
                        return false;
                    }
                }
                
                st.pop();
            }
            
        }
        
        return st.isEmpty();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "[()]{}{[()()]()}";
        boolean result = validPar(str);
        System.out.println(result);

	}
}
