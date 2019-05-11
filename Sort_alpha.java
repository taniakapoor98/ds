package myproject;

import java.util.Scanner;

public class Sort_alpha {

	
		public String sort(char arr[])
		{
			
			for(int i=0;i<arr.length;i++)
			{
				int small=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[small])
					{
						small=j;
					}
				}
				if(small!=i)
				 swap(arr,i,small);
			}
			String ans=new String(arr);
			return ans;
		}
		 void swap(char arr[],int a,int b)
		{
			char c=arr[a];
			arr[a]=arr[b];
			arr[b]=c;
		}
		
		
		
	
	public static void main(String[] args) {
		
		Sort_alpha o=new Sort_alpha();
		System.out.println("Enter str");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		
		System.out.println(o.sort(arr));
	}

}
