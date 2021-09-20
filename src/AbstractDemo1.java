abstract class Writer
{
    public abstract void write();
}

class Pen extends Writer
{
    public void write()
    {
        System.out.println("I am a Pen");
    }
}

class Pencil extends Writer
{
    public void write()
    {
        System.out.println("I am a pencil");
    }
}

class Kit
{
    public void perform(Writer p) // p can receive object which have reference to either Pen or Pencil
    {
        p.write();
    }
}
public class AbstractDemo1 {
    public static void main(String args[])
    {
        Kit obj1 = new Kit();
        Writer obj2 = new Pen(); // here object of type Pen is created and reference is assigned to type Writer.
        Writer obj3 = new Pencil();
        obj1.perform(obj2);
    }
}
