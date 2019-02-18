class node{
	int data;
	node next;
}
 class create {
node head;
public void insert(int data){
    node ptr=head;
	node newnode=new node();
	newnode.data=data;
	newnode.next=null;
	
	if(head==null){
		head=newnode;
		//System.out.println(newnode.data);
		 ptr=head;
	}
	else{
		
		//System.out.println(newnode.data);
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=newnode;
		
	
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

public void insertAt(int i,int val)
{   node newnode=new node();
	newnode.data=val;
	newnode.next=null;
	node ptr=head;
	int count=1;
	while(ptr.next!=null)
	{	
		count++;
		ptr=ptr.next;
	}
	if(i==1)
	{
		newnode.next=head;
		head=newnode;
	}
	else if(i==count+1)
	{
		ptr=head;
		int temp=1;
		while(temp!=count)
		{
			ptr=ptr.next;
			temp++;
		}
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
		newnode.next=ptr.next;
		ptr.next=newnode;
	}
}

public void show(){
	node ptr=head;
	while(ptr!=null){
		System.out.println(ptr.data);
		ptr=ptr.next;
	}
}


 }

class linked_list{
	public static void main(String[] args) {
		
		create o=new create();
		o.insert(22);
		o.insert(21);
		o.insert(2);
		o.insert(20);
		o.show();
		o.delAt(4);
		System.out.println();
		o.show();
		System.out.println();
		o.insertAt(4, 9);
		o.show();


	}

}
