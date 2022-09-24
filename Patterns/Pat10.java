class Pat10
{
	public static void main(String[] args)
	{
		int asc =65;
		for(int i=4 ; i>=0 ; i--)
		{
			for(int j=0; j<i ; j++)
			{
				System.out.print(" ");
			}
			for(int j=4; j>=i ; j--)
			{
				System.out.print((char) (asc+ j)+" ");
			}
		System.out.println();	
		}
	}
}