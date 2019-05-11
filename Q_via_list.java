package myproject;

class Node22{
	int data;
	Node22 next;
	Node22(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}

public class Q_via_list {
	Node22 front=null;
	Node22 rear=null;
	void enque(int data)
	{
		
		
		Node22 newnode=new Node22(data);
		
		if(front==null && rear==null)
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=rear.next;
		}
	}
	
	int deque()
	{
		if(front==null && rear==null)
		{
			System.out.println("empty");
			return -99;
		}
		else
		{
			int data=front.data;
			front=front.next;
			return data;
		}
	}
	
	void traverse()
	{
		Node22 ptr=front;
		while(ptr!=rear.next)
		{
			System.out.print( ptr.data+"->");
			ptr=ptr.next;
		}
	}
	public static void main(String[] args) {
		Q_via_list q=new Q_via_list();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		
		q.traverse();
		System.out.println();
		q.deque();
		q.traverse();

	}

}
