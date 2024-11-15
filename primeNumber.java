import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
   public static int primeNumber(int n){
    //   base case:
        if(n == 0 || n == 1) return 0;
        int sum = 0;
        
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int  j=2; j<=Math.sqrt(i); j++){
                if(i % 2 == 0){
                    isPrime = false;
                    break;
                }
            }
            
            sum = sum + i;
        }
        return sum;
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int n = 3;
		
		int result = primeNumber(n);
		System.out.println(result);

	}
}
