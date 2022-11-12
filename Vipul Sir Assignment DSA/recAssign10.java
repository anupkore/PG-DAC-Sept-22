import java.util.*;

class recAssign10
{
	static int i=0;
	static void print( String s1 , int n)
	{
		if(i>=n)
			System.out.println();
		else if ((s1.charAt(i))==(s1.charAt(i+1)))
		{
			System.out.print(s1.charAt(i+1));
			i++;
			print(s1 , n);
		}
		else
		{
			System.out.print(s1.charAt(i+1));
			i++;
			print(s1 , n);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		String str = sc.next();
		
		print(str , str.length());
		
		
	}
}