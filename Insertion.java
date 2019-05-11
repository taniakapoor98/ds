package myproject;

import java.util.Scanner;

public class Insertion {

	 void sort(int arr[])
	 {
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			while(j>0 && arr[j]<arr[j-1])
			{
				swap(arr,j,j-1);
				j--;
			}
		}
	 }
	 
	 void swap(int arr[],int curr,int pos)
	 {
		int c=arr[curr];
		arr[curr]=arr[pos];
		arr[pos]=c;
	 }
	 
	 void print(int arr[]) 
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	 }
	public static void main(String[] args) {
		int a[];
		System.out.println("Enter size");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		a=new int[size];
		System.out.println("Enter "+size+" elements");
		Scanner s2=new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			int b=s2.nextInt();
			a[i]=b;
		}
		
		Insertion b=new Insertion();
		b.sort(a);
		System.out.println();
		b.print(a);

	}

}
