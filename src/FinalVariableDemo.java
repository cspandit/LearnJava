//we are not allowed to change the value of final variable
//we are not allowed to extend the final class
//we cannot override final method


//Example : final variable
class Example
{
    final int i = 0;
    public Example()
    {
        //i = 10;
    }
}


// Example : final class
final class Xx
{
    public void show()
    {
        System.out.println("In show ");
    }
}

//class Yy extends Xx  This is invalid statement


// Example final method

class Aa
{
    public final void show()
    {
        System.out.println("In show A");
    }
}

class Bb extends Aa
{
    // public void show()   This is invalid statement
    {
        System.out.println("In Class B");
    }
}


public class FinalVariableDemo {
    public static  void main(String args[])
    {

    }
}
