package myproject;

import java.util.Scanner;

class node{
	int data;
	node next;
}

class create {
	node head;
	public void insert(int data)
	{
	   node ptr=head;
		node newnode=new node();
		newnode.data=data;
		newnode.next=null;
		
		if(head==null)
		{
			head=newnode;
			//System.out.println(newnode.data);
			 ptr=head;
		}
		else
		{
			
			//System.out.println(newnode.data);
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
			
		
		}
		
	}
	
	public void del_same()
	{
		node ptr=head;
		
		while(ptr!=null)
		{
			node temp=head;
			
			while(temp!=null)
			{
			
				if(ptr.data+temp.data==0 && temp.data!=0 && ptr.data!=0)
				{
					System.out.println(ptr.data+" "+temp.data);
					del_by_val(temp.data);
					del_by_val(ptr.data);
					
				}
				
				temp=temp.next;
			}
			
			ptr=ptr.next;
			
		}
	}
	
	public void delAt(int i)
	{ node ptr=head;
	  int count=1;
		while(ptr.next!=null)
		{
			count++;
		    ptr=ptr.next;
		}
		//System.out.println(count);
		if(i==1)
		{
			head=head.next;	
		}
		
		else if(i==count)
		{ptr=head;
			int temp=1;
			while(temp!=count-1)
			{
				ptr=ptr.next;
				temp++;
			}
			ptr.next=null;
		}
		else
		{   ptr=head;
			int temp=1;
			while(temp!=i-1)
			{
				ptr=ptr.next;
				temp++;
			}
			ptr.next=ptr.next.next;
		}
	}
	
	void del_by_val(int val)
	{
		int count=1;
		node ptr=head;
		while(ptr!=null)
		{
			if(ptr.data==val)
			{
				delAt(count);
			}
			count++;
			ptr=ptr.next;
		}
		
	}
	
	public void show()
	{
		node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
}

public class del_opp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create o=new create();
		int n=6;
		System.out.println("enter "+n+" elements"+"\n");
		for(int i=0;i<n;i++)
		{
			Scanner s=new Scanner(System.in);
			int data=s.nextInt();
			o.insert(data);

		}
		o.del_same();
		System.out.println();
		o.show();
		
	}

}
