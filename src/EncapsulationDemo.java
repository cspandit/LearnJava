class Student
{
    // Encapsulation is binding that with method. So that it cannot be modified outside class
    private int roll_number;
    String name;

    public void setRollNumber(int r)
    {
        roll_number = r;
    }
    public int getRollNumber()
    {
        return roll_number;
    }
}
public class EncapsulationDemo {
    public static void main(String args[])
    {
        Student obj1 = new Student();
        obj1.setRollNumber(89);
        System.out.println(obj1.getRollNumber());
        obj1.name = "Chandra"; // We are able to assign value to name because it is not private
        //System.out.println(obj1.roll_number);
    }
}
