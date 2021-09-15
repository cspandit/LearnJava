class A
{
	public A()
	{
		System.out.println("Inside default constructor of A");
	}
	public A(int i)
	{
		System.out.println("Inside parametrize constructor of A");
	}
}

class B extends A
{
	public B()
	{
		super(10);
		System.out.println("Inside default constuctor of B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("Inside parameterize constructor of B");
	}
}

public class SuperDemo 
{
	public static void main(String args[])
	{
		// First the constructor of super class is called.
		// By default all the constructor method has predefined super() class which is responsible for calling constructor of super class.
		// If we want to call any particular constructor in super class we need to make adjustment in super() method of sub class.
		B obj = new B();
		
	}
}
