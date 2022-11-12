import java.util.*;

class recAssign11
{
	static void removeX(String s , int n)
	{
		for(int i=0 ; i<n ;i++)
		{
			if(s.charAt(i) == 'x')
			continue;
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		String str = sc.next();
		
		removeX(str,str.length());
	}
}