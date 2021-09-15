class Calculatorx
{
	int i;
	int j;
	float result;
	
	public void addition()
	{
		result = i+j;
	}
	public Calculatorx(int i, int j)
	{
		this.i = i; // This is reference to the current object
		this.j = j;
		System.out.println("This is constructor with arguments");
	}
	
	public Calculatorx()
	{
		i = 5;
		j = 4;
		System.out.println("This is constructor without arguments");
	}
}
public class ConstructorDemo {
	public static void main(String args[])
	{
		Calculatorx obj = new Calculatorx(100, 200);
		obj.addition();
		System.out.println(obj.result);
				
	}

}
