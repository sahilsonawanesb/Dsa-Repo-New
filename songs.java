import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
   public static int songsPlaylist(String str, int k){
    //   solving using sliding window approach 
    int i=0;
    int j=0;
    int currentcount = 0;
    int maxcount = 0;
    
    
    while(j<k){
        if(str.charAt(j) == 'a') {
          currentcount++;  
        }
        j++;
    }
    
   maxcount = currentcount;
    
    while(j<str.length()){
        if(str.charAt(i) == 'a') 
        {
            currentcount--;
            
        }
        if(str.charAt(j) == 'a') {
            currentcount++;
        }
        maxcount = Math.max(maxcount, currentcount);
        i++;
        j++;
    }
    
       return maxcount;
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		int k=3;
		String str = "abcaca";
		
		int result = songsPlaylist(str, k);
		System.out.println(result);

	}
}
