package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println( "How many number of sieves do you want");
		int number=in.nextInt();
		
		int[] sieve = new int[number];
	     
		for (int i = 0; i < sieve.length; i++)
		{
			 sieve[i] = i+1;
			 System.out.println( sieve[i] );
		}
	
		for  (int i = 0; i < sieve.length; i++) 
		{
		   if (sieve[i] % 2 == 0 || sieve[i] % 3== 0 || sieve[i] % 5 == 0 || sieve[i] % 7 == 0)
		   {
			 
		   } else {
			   System.out.println(sieve[i]);
		   }
		}
	
	
	
	
	}
	
	 

}
