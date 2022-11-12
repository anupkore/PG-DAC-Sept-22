import java.util.*;

class recAssign2
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int num = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==num)
			{
			System.out.println("true");
			count++;
			break;
			}
		}
		if(count == 0)
			System.out.println("false");
	}
}