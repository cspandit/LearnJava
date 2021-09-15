// For all the primitive data types like int, float, strings etc. we have wrapper class.
// This allows us to use int, float, string etc, in form object rather than in form of variables
// This gives us complete OOPS sense.
// Most of the wrapper class are deprecated after java 9
public class WrapperClassDemo {
    public static void main(String args[])
    {
        String x = "Chandra";//Primitive
        String i = new String("Chandra");//Wrapper class
        System.out.println(i);

        //Integer m = 9; Autoboxing or auto wrapping
        //int n = m; // Auto unboxing

        String str = "123";
        int mm = Integer.parseInt(str);
        System.out.println(mm);

    }
}
