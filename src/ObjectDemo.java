class Calculator
{
	int x;
	int y;
	int result;
	
	public void addition()
	{
		result = x+y;
	}
}

public class ObjectDemo {
	public static void main(String[] args)
	{
		Calculator obj = new Calculator();
		obj.x = 1;
		obj.y = 2;
		obj.addition();
		System.out.print(obj.result);
		
	}

}
