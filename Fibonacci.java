package myproject;

import java.util.Scanner;

public class Fibonacci {
	
	
	long fibo(int n)
	{
		if(n==1)
		 {return 0;}
		else if(n==2)
		{return 1;}
		
		else
			return (fibo(n-1)+fibo(n-2));
	}
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		System.out.println("Enter n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(f.fibo(i));

		}
		

	}

}
