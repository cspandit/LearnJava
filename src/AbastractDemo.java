// object of abstract class cannot be created. Abstract class is supposed to extended by some other class
// It just shows template of methods which needs to be implemented.

abstract class Human // Human is called abstract class
{
    public abstract void eat();// If we don't want implement method we must need to add keyword
    // abstract in method definition.
    public void walk()
    {

    }
}
class Man extends Human // Man is called concrete class
{
    public void eat()
    {

    }
}
public class AbastractDemo {
    public static void main(String args[])
    {
        Man m = new Man();
        m.eat();
        m.walk();
    }
}
