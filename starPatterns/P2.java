class P2
{
	public static void main(String[] args)
	{
		int i=50 , j=20 , k=30;
		
		//int max = i<j ? i : j<k ? j : k;
		//System.out.println("Smallest number is: "+max);
		
		String max = i<j ? "i smallest" : j<k ? "j smallest" : "k smallest";
		System.out.println(max);
		
	}
}