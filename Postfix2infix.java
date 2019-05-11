package myproject;
class Stack21{
	final static int SIZE = 30;
	String arr[] = new String[SIZE];
	int top;

	Stack21(){
		top = -1;
	}

	public void push(String data){
		if(top == SIZE - 1){
			System.out.println("Stack is full/overflow");
		}else{
			top++;
			arr[top] = data;
		}
	}

	public String pop(){
		if(top == -1){
			System.out.println("Stack is empty/underflow");
			return "$";
		}else{
			String data = arr[top];
			top--;
			return data;
		}
	}

	public String peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return "$";
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

public class Postfix2infix {
	
	static boolean isOperand(char x) 
	{ 
	    return (x >= 'a' && x <= 'z') || 
	            (x >= 'A' && x <= 'Z'); 
	} 
	
	public String post2in(String s)
	{
		String res="";
		Stack21 stack=new Stack21();
		for(int i=0;i<s.length();i++)
		{
			if(isOperand(s.charAt(i)))
				{
					stack.push(s.charAt(i)+"");
				
			}
			else
			{
				String op1=stack.pop();
				String op2=stack.pop();
				stack.push("("+op2+s.charAt(i)+op1+")");
			}
		}
		
		return stack.peek();
	}

	public static void main(String[] args) {
		Postfix2infix o=new Postfix2infix();
		StringBuilder str=new StringBuilder("ABCDE*+-+");
		
		System.out.println(o.post2in(str.toString()));
	}

}
