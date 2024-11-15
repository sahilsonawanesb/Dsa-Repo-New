import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int stringTransformation(String str1, String str2){
        // Maintain ine hashMap to stored the frequency count of str2:
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        
        // then traverse into the string 2 
        for(int i=0; i<str2.length(); i++){
            char c = str2.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        // now traverse the string 1 and subtract the charater from it goes
        for(int i=0; i<str1.length(); i++){
            char c = str1.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) - 1);
            }
        }
        
          for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            count += entry.getValue();
        }
        
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str1 = "XYZ";
		String str2 = "ABC";
		
		int result = stringTransformation(str1, str2);
		System.out.println(result);

	}
}
