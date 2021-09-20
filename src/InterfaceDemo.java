// Interface gives a way to implement multiple inheritance in java.
// We cannot define any method inside Interface, we can just do abstract declaration of a method
// Sub class just implement Interface instead of extending it.
// we cannot create a object of interface, we can only create a reference of it

// There are three types of interface:
// 1. Normal
// 2. Functional
// 3. Marker


interface WriterInter
{
    void write(); // By default, all the method declaration inside interface is abstract of its nature
}

class Highlighter
{
    public void highLight()
    {
        System.out.println("High light is yellow");
    }
}
// class PenInter extends Highlighter, Writer will give error as multiple inheritance is not supported
class PenInter extends Highlighter implements WriterInter
{
    public void write()
    {
        System.out.println("I am pen");
    }
}

class PencilInter extends Highlighter implements WriterInter
{
    public void write()
    {
        System.out.println("I am pencil");
    }

}

class KitInter
{
    public void doTask(WriterInter obj)
    {
        obj.write();
    }
}

public class InterfaceDemo {
    public static void main(String args[])
    {
        KitInter k = new KitInter();
        WriterInter p = new PenInter();
        WriterInter pc = new PencilInter();

        k.doTask(pc);
    }

}
