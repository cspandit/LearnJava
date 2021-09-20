// When the only purpose of a class is to override the method of parent class
// then we don't to declare explicit child class.

class ABC
{
    public void Anyfun()
    {
        System.out.println("Anything");
    }
}

/*class NewABC extends ABC
{
    public void Anyfun()
    {
        System.out.println("Something");
    }
}*/


// Anonymous class can also be used to implement interface
interface Exam
{
    void goodFunction();
}


// This becomes redundant after using anonymous class.
/*class ExamOver implements Exam
{
    public void goodFunction()
    {
        System.out.println("I am good function");
    }
}*/

public class AnnonymousClassDemo {

    public static void main(String args[])
    {
        // Here definition inside act as a class without any name whose object reference is assigned to obj
        ABC obj = new ABC()
        {
            public void Anyfun()
            {
                System.out.println("Something");
            }
        };
        obj.Anyfun();

        Exam ex = new Exam()
        {
            public void goodFunction()
            {
                System.out.println("I am good function");
            }
        };

        // Line 51 to 57 can be achieved in on line
        Exam new_ex = ()-> System.out.println("I am good function");

        ex.goodFunction();
        new_ex.goodFunction();
    }
}
