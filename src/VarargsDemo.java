class Sum
{
	int summation(int ... arr) // ... indicates that variable size arguments will collected in variable arr. This is called as variable length argument.
	{
		int sum  = 0;
		for(int x : arr) 
		{
			sum = sum+x;
		}
		return sum;
	}
}
public class VarargsDemo {
	public static void main(String args[])
	{
		Sum obj = new Sum();
		System.out.print(obj.summation(1,2,3,4));
	}
}
