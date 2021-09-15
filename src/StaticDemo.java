class Employee
{
	int id;
	int salary;
	static String ceo; // static variables are of class level and loaded into class loader memory. It applies to all the objects of a class
	// static String ceo = "Chandra";
	
	static // Static blocks are loaded just once when class is loaded
	{
		ceo = "Chandra";
	}
	public Employee(int id, int salary)
	{
		this.id = id;
		this.salary = salary;
	}
	
	public void show()
	{
		System.out.println(id + " : " + salary + " : " + ceo);
	}
	
}
public class StaticDemo {
	public static void main(String args[])
	{
		//Employee.ceo = "Chandra";
		Employee navin = new Employee(1, 400);
		Employee mahesh = new Employee(2, 500);
		
		navin.show();
		mahesh.show();
		
		navin.ceo  = "Nilita"; // static variables can be called on both objects and class.
		navin.show();
		mahesh.show();
	}

}
