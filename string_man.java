package myproject;

public class string_man {
   
	
	public void find_palindrome(String s)
	{
		int i;
		String p="";
		int l=s.length();
		
			for( i=0;i<l-3;i++)
			{
				p+=s.charAt(i);
				p+=s.charAt(i+1);
				p+=s.charAt(i+2);
				String r=reverse(p);
				if(p.contentEquals(r))
					System.out.println(p);
				p="";
			}
		
	}
	
	 String reverse(String s)
	{
		int l=s.length();
		String r="";
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string_man o=new string_man();
		o.find_palindrome("jhbhjbjhvghjbhjglkhghftrdyfylughgfulvululugvlju");
	}

}
