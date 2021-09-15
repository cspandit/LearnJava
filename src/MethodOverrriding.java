class X
{
	int i;
	public void show()
	{
		System.out.println("Inisde X : " + i);
	}
}
class Y extends X
{
	public void show()
	{
		super.show();
		System.out.println("Inside Y : " + i);
	}
}
public class MethodOverrriding 
{
	public static void main(String args[])
	{
		Y obj  = new Y();
		obj.show();
	}

}
