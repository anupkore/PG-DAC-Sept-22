import java.util.*;
class recAssign5
{
	 static int print(int n, int i)
    {
        if(i <= n)
        {
            System.out.print(i+" ");
            return(print(n,++i));
        }
        return 1;
    }
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		print(num,1);
	}
}