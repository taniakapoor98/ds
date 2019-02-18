class Node1{
	int data;
	Node1 next;
	Node1 prev;
}

class doubly_list
{
	Node1 head,tail;
	public void create(int data)
	{
		Node1 newnode=new Node1();
		newnode.data=data;
		Node1 ptr=head;
		newnode.next=null;
		newnode.prev=null;
		
		if(head==null)
		{
			head=newnode;
			newnode.prev=null;
			ptr=head;
		}
		else
		{
			
			while(ptr.next!=null)
			 ptr=ptr.next;
			ptr.next=newnode;
			newnode.prev=ptr;
			tail=newnode;
			
		}
		
	}
	
	public void insert(int i,int val)
	{
		Node1 newnode=new Node1();
		newnode.data=val;
		Node1 ptr=head;
		newnode.next=null;
		newnode.prev=null;
		int count=1;
		while(ptr.next!=null)
		{	
			count++;
			ptr=ptr.next;
		}
		if(i==1)
		{	
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
			newnode.prev=null;
		}
		else if(i==count+1)
		{	int temp=1;
			ptr=head;
			while(temp!=i-1)
			{
				ptr=ptr.next;
				temp++;
			}
			newnode.prev=ptr;
			ptr.next=newnode;
			
		}
		else
		{
			ptr=head;
			int temp=1;
			while(temp!=i-1)
			{
				ptr=ptr.next;
				temp++;
			}
			newnode.prev=ptr;
			newnode.next=ptr.next;
			ptr.next.prev=newnode;
			ptr.next=newnode;
			
		}
	}
	public void delAt(int i)
	{
		Node1 ptr=head;
		int count=1;
		while(ptr.next!=null)
		{	
			count++;
			ptr=ptr.next;
		}
		if(i==1)
		{
			head.next.prev=null;
			head=head.next;
		}
		else if(i==count)
		{
			ptr=head;
			int temp=1;
			while(temp!=count-1)
			{
				ptr=ptr.next;
				temp++;
			}
			ptr.next.prev=null;
			ptr.next=null;
		}
		else
		{
			ptr=head;
			int temp=1;
			while(temp!=i-1)
			{ 	
				ptr=ptr.next;
				temp++;
			}
			ptr.next.prev=null;
			ptr.next.next.prev=ptr;
			ptr.next=ptr.next.next;
		}
	}
	public void show()
	{
		Node1 ptr=head;
		while(ptr!=null){
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}

}
public class doubly_linked
{
	 public static void main(String args[])
	 {
		 doubly_list o=new doubly_list();
			o.create(22);
			o.create(21);
			o.create(10);
			o.create(20);
			o.show();
			System.out.println();
			o.insert(1, 9);
			o.show();
			System.out.println();
			o.insert(6, 0);
			o.show();
			System.out.println();
			o.insert(3, 7);
			o.show();
			System.out.println();
			o.delAt(7);
			o.show();
		 
	 }
}