class Pat6
{
	public static void main(String[] args)
	{
	int temp=12;
	for(int i=1 ; i<=7 ; i++)
	{
		for(int j=temp ; j>=i ; j--)
		{
			System.out.print(" ");
			
		}
		for(int k=1 ; k<=i ; k++)
		{
			System.out.print(" *");
		}
		System.out.println();
		temp=temp-1;
	}
	}
}