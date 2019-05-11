package myproject;

class Stacks
{
	final static int size=20;
	char arr[]=new char[size];
	int top;
	Stacks()
	{
		top=-1;
	}
	public void push(char data) {
		if(top==size-1)
		{
			System.out.println("full!");
		}
		else
		{
			top++;
			arr[top] = data;
		}
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Empty!");
			return 999;
		}
		else
		{
			int x=arr[top];
			top--;
			return x;
		}
	}
	
	public void traverse()
	{
		if(top==-1)
		{
			System.out.println("Empty.Nothing to see here!");
		}
		else
		{
			
			for(int i=top;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
}

public class Que_via_stack {
	
	
	
	public static void main(String[] args) {
		
		

	}

}
