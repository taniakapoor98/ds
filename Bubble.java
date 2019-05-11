package myproject;

import java.util.Scanner;

public class Bubble {
	
	private char arr[];
	
	 Bubble(char arr[],int size)
	 {
		this.arr=new char[size];
		this.arr=arr;
	}
	
	 void sort()
	 {
		boolean sorted=false;
		while(!sorted)
		{
			sorted=true;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					swap(i);
					sorted=false;
				}
			}
		}
		
	 }
	 
	 void swap(int pos)
	 {
		 char c=arr[pos];
		 arr[pos]=arr[pos+1];
		 arr[pos+1]=c;
	 }
	 
	 void print() 
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
	 }
	 
	public static void main(String[] args) {
		char a[];
		System.out.println("Enter n");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		a=new char[size];
		System.out.println("Enter "+size+" elements");
		Scanner s2=new Scanner(System.in);
		String b1=s2.nextLine();
		for(int i=0;i<size;i++)
		{
			
			a[i]=b1.charAt(i);
		}
		
		Bubble b=new Bubble(a,b1.length());
		b.sort();
		System.out.println();
		b.print();
	}

}
