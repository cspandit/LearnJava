class Calx
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class AdvanceCal extends Calx
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class VeryAdvanceCal extends AdvanceCal // This is multilevel inheritance. Java doesn't support multiple inheritance.
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}


public class InheretanceDemo 
{
	public static void main(String args[])
	{
		VeryAdvanceCal obj = new VeryAdvanceCal();
		System.out.println(obj.add(10, 5));
		System.out.println(obj.sub(10, 5));
		System.out.println(obj.mul(10, 5));
		
	}
}
