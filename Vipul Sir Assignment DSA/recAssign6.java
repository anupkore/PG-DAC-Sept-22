import java.util.*;
class recAssign6
{
	static int count = 0;
	static void digits(int n)
	{
		if(n/10==0)
		{
		count++;
		System.out.println("Number of digits = "+count);
		}
		else
		{
			int temp = n / 10;
			count++;
			digits(temp);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		digits(num);
	}
}