package myproject;

public class LongPal {

	public String find(String s)
	{
		StringBuilder long_pal=new StringBuilder();
		StringBuilder str;
		for(int i=0;i<s.length()-2;i++)
		{
			for(int j=i+3;j<=s.length();j++)
			{
				boolean ans;
				str=new StringBuilder(s.substring(i,j));
				ans=isPalindrome(str.toString());

				if(ans==true)
				{
					
					if(long_pal.length()<str.length())
					{
						long_pal=str;
						
					}
				}
			}
		}
		return long_pal.toString();
		
	}
	public boolean isPalindrome(String str)
	{
		StringBuilder s=new StringBuilder(str);
		boolean isPal=false;
		String rev=s.reverse().toString();
			if(str.equals(rev))
				isPal=true;
			else
				isPal=false;
		return isPal;
	}
	
	public static void main(String[] args) {
		LongPal o=new LongPal();
		//System.out.print(o.isPalindrome("tania"));
		
		System.out.println(o.find("zCVBNMKLOIUYTGNJKLKJHGFRTYUKMNBGHJKL;POKJHGFGHJKLKJHGF"));
	}

}
