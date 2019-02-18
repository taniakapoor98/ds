package myproject;
import java.util.Scanner;
public class array_sum {
	

	
	    int a[][]=new int[10][10];

	    public void input(int n)
	    {
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                Scanner o=new Scanner(System.in);
	                int b=o.nextInt();
	                a[i][j]=b;
	            }
	        }
	    }
	    
	    void sum_upper(int n)
	    {   
	    	int s=0;
	    	for(int i=0;i<n;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		{
	    			if(j>=i)
	    			{
	    				s=s+a[i][j];
	    			}
	    		}
	    	}
	    	System.out.println(s);
	    }
	    
	    void sum_lower(int n)
	    {   
	    	int s=0;
	    	for(int i=0;i<n;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		{
	    			if(i>=j)
	    			{
	    				s=s+a[i][j];
	    			}
	    		}
	    	}
	    	System.out.println(s);
	    }
	    void show(int n)
	    {
	    	for(int i=0;i<n;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		{
	    			System.out.print(a[i][j]+"\t");
	    		}
	    		System.out.println();
	    	}
	    	
	    }


	    public static void main(String args[])
	    {
	    	System.out.println("enter n");
	    	Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	        array_sum o=new array_sum();
	        System.out.println("enter elements");
	        o.input(n);
	        o.sum_upper(n);
	        System.out.println();
	        o.sum_lower(n);

	    }
	


}
