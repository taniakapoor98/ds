package myproject;
class Stack22{
	final static int SIZE = 10;
	char arr[] = new char[SIZE];
	int top;

	Stack22(){
		top = -1;
	}

	public void push(char data){
		if(top == SIZE - 1){
			System.out.println("Stack is full/overflow");
		}else{
			top++;
			arr[top] = data;
		}
	}

	public char pop(){
		if(top == -1){
			System.out.println("Stack is empty/underflow");
			return '$';
		}else{
			char data = arr[top];
			top--;
			return data;
		}
	}

	public char peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return '$';
		}
		else
		{
			return arr[top];
		}
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	

	
}
public class Infix2postfix {

	
	public int precedence(char op)
	{
		if(op=='+' || op=='-')
			return 1;
		else if(op=='*' || op=='/')
			return 2;
		else  if(op == '^') 
		    return 3;
		else 
			return -1;
		
	}
	
	public String inf_post(String s)
	{
		Stack22 my_stack=new Stack22();
		String res="";
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				res=res+s.charAt(i);
			}
			else if(s.charAt(i)=='+' || s.charAt(i)=='/' || s.charAt(i)=='*' || s.charAt(i)=='-' || s.charAt(i)=='^'  )
			{
			char op=s.charAt(i);
////				if(my_stack.isEmpty()==true)
////					my_stack.push(s.charAt(i));
//				if(precedence(op)>precedence(my_stack.peek()))
//				{
//					my_stack.push(s.charAt(i));
//				}
//				else
//				{
//					res=res+my_stack.pop();
//					my_stack.push(s.charAt(i));
//				}
				while (!my_stack.isEmpty() && precedence(op) <= precedence(my_stack.peek()))
					res += my_stack.pop();
				my_stack.push(op);
				
			}
			
			else if(s.charAt(i)=='(' )
				my_stack.push(s.charAt(i));
			else if(s.charAt(i)==')')
			{
				while(my_stack.peek()!='(' && !my_stack.isEmpty())
					res=res+my_stack.pop();
				if(my_stack.peek()=='(')
					my_stack.pop();
				
				
			}
		}
		
		if(i==s.length())
		{
			while(!my_stack.isEmpty())
			{
				res=res+my_stack.pop();
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Infix2postfix o=new Infix2postfix();
		System.out.println(o.inf_post("a+b*(c^d-e)^(f+g*h)-i"));

	}

}
