
public class Iteration {
	public static void main(String[] args) {
		int count = 0;
		
		while(count < 5) {
			System.out.println(count);
			count++;
		}
		
		int i = 0;
		do{
			System.out.println("Hello");
			i++;
		}while(i<=5);
		
		for(int j=1;j<=10;j++)
		{
			for(int k=1;k<=j;k++) 
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
