import java.util.*;

class recAssign7
{
	static int sum( int arr[] , int n )
	{
		if( n <= 0 )
		return 0;
		
		else
			return arr[n-1] + sum(arr , n-1) ;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int arr2[] = new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0 ; i<size ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Sum of array elements is");
		System.out.println(sum(arr2,size));
	}
}