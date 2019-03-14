package myproject;
class Node0{
	int data;
	Node0 next;
}
class Create
{
	Node0 head=null;
	Node0 tail=null;
	boolean cycle=false;
	
	public void insert(int data)
	{
		Node0 newnode=new Node0();
		newnode.data=data;
		newnode.next=null;
		Node0 ptr=head;
		if(head==null)
		{
			head=newnode;
			ptr=head;
		}
		else
		{
			while(ptr.next!=null)
			{
				
				ptr=ptr.next;
			}
			
			ptr.next=newnode;
			tail=newnode;
		}
		

	}

	public void detect_rem()
	{
		tail.next=head.next.next;//cycle created
		Node0 slow=head;
		Node0 fast=head;
	
		
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow == fast)
			{
				cycle=true;
				break;}
			
		}
		if(cycle==true)
		{
			Node0 ptr1=head;
			Node0 ptr2=fast;
			
			while(ptr1.next!=ptr2.next)
			{
				ptr1=ptr1.next;
				ptr2=ptr2.next;
			}
			
			ptr2.next=null;
		}
		
		
	}
	
	public void show()
	{
		Node0 ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		
		System.out.println(cycle);
		
	}
	
}
public class cycle {

	public static void main(String[] args) {
		
		Create o=new Create();
		o.insert(1);
		o.insert(2);
		o.insert(3);
		o.insert(4);
		o.insert(5);
		o.detect_rem();
		o.show();
	}

}
