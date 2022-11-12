import java.util.*;

class recAssign11_2
{
	static int i=0;
	static void removeX(String s , int n)
	{
		if(i <= n-1)
		{
			if(s.charAt(i) == 'x')
			{
				i++;
				removeX(s,n);
			}
			else
			{
				System.out.print(s.charAt(i));
				i++;
				removeX(s,n);
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