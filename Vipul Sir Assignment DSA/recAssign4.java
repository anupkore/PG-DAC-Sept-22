import java.util.*;
class recAssign4
{
	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0 ; i < arr.length ;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int num = sc.nextInt();
		outer : for(int i=0 ; i<arr.length ; i++)
		{
			for(int k=0;k<arr.length;k++)
			{
				if(arr[i] == arr[k])
				{
					temp=i;
					continue outer;
				}
			}
		}
		
		System.out.println(temp);
	}
}