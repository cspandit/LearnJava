
public class Selection {
	public static void main(String[] args) {
		int n = 0;
		
		if (n==0){
			System.out.println("Nothing");
			System.out.println("Bye");
		}
		
		else if(n%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
		// ternary operator -> condition ? statement1: statement2
		
		int a=6;
		
		int b = (a>5)?1:2;
		System.out.println(b);
	}

}
