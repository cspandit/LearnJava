class Outer
{
	int a;
	
	public Outer(int a)
	{
		this.a = a;
		System.out.println("This is constructor of outer class");
	}
	
	public void show()
	{
		System.out.println(a);
	}
	
	class Inner // can be static class inner 
	{
		int b;
		
		public Inner(int b)
		{
			this.b = b;
			System.out.println("This is constructor of inner class");
		}
		public void display()
		{
			System.out.println(b);
		}
	}
}

public class InnerClassDemo
{
	public static void main(String args[])
	{
		Outer obj1 = new Outer(1);
		obj1.show();
		
		Outer.Inner obj2 = obj1.new Inner(100); // for static class : Outer.Inner = new Outer.Inner();
		obj2.display();
	}
}
