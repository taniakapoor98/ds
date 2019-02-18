class nod
{
	int data;
	nod next;
	nod prev;
}

class circular_list
{	
	nod head,tail;
	public void create(int data)
	{
		nod ptr=head;
		nod newnode=new nod();
		newnode.data=data;
		newnode.next=null;
		
		if(head==null)
		{
			head=newnode;
			newnode.prev=newnode;
			ptr=head;
			newnode.next=head;
		}
		else
		{
			while(ptr.next!=head)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
			newnode.prev=ptr;
			newnode.next=head;
			tail=newnode;
			head.prev=tail;
		}
		
	}
	
	public void insertAt(int i,int val)
	{	
		nod ptr=head;
		nod newnode=new nod();
		newnode.data=val;
		newnode.next=null;
		newnode.prev=null;
		int count=1;
		while(ptr.next!=head)
		{
			count++;
			ptr=ptr.next;
		}
		if(i==1)
		{	
			newnode.prev=head.prev;
			ptr.next=newnode;
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
		}
		
		else if(i==count+1)
		{
			newnode.next=head;
			head.prev=newnode;
			ptr.next=newnode;
			newnode.prev=ptr;
			tail=newnode;
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
		nod ptr=head;
		int count=1;
		while(ptr.next!=head)
		{
			count++;
			ptr=ptr.next;
		}
		if(i==1)
		{
			
		}
	}
	
	public void show()
	{
		nod ptr=head;
		while(ptr.next!=head)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
		//System.out.println(head.data +" "+tail.data + " "+tail.next.data +" "+head.prev.data);

		
	}
}
public class circular {

	public static void main(String[] args)
	{
		
		circular_list o=new circular_list();
		o.create(22);
		o.create(21);
		o.create(10);
		o.create(20);
		o.show();

	}

}
