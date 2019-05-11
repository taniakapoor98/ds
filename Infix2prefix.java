package myproject;



public class Infix2prefix {
//steps:reverse i/p string
//note: ( becomes ) and vice-versa ,hense in place of) use (  in postfix code
//reverse the postfix result to get infix
	
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
			
			else if(s.charAt(i)==')' )
				my_stack.push(s.charAt(i));
			else if(s.charAt(i)=='(')
			{
				while(my_stack.peek()!=')' && !my_stack.isEmpty())
					res=res+my_stack.pop();
				if(my_stack.peek()==')')
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
		StringBuilder res_new=new StringBuilder(res);
		return res_new.reverse().toString();
	}
	
	public static void main(String[] args) {
		Infix2prefix o=new Infix2prefix();
		StringBuilder str=new StringBuilder("(A-B/C)*(A/K-L)");
		
		System.out.println(o.inf_post(str.reverse().toString()));

	}

}
