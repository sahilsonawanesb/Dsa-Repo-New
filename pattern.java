import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    
  
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n = 7;
	    
	    int stars = n;
	    int spaces = 0;
	    
	    for(int i=0; i<n; i++){
	        
	       // spaces
	       for(int j=0; j<spaces; j++){
	           System.out.print(" ");
	       }
	       
	       //stars..
	       for(int j=0; j<stars; j++){
	           System.out.print("*");
	       }
	       
	       spaces++;
	       stars--;
	       System.out.println();
	    }

	}
}
