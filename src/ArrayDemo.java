import java.util.Arrays;

public class ArrayDemo
{
	public static void main(String[] args)
	{
		int array[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			array[i] = i*2;
		}
		
		System.out.println("This is new array: ");
		for(int j=0;j<5;j++) 
		{
			System.out.print(array[j] + " ");
		}
		System.out.println();
		System.out.println("The size of array is: "+array.length);
		
		
		int start = 0;
		int end  = 4;

		while(start < end)
		{
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println("reversed array is: " + Arrays.toString(array));
		
		int array1[]= {1,2,3,4,6};
		System.out.println(Arrays.toString(array));
		
		//Two dimensional array
		
		int arr2d[][] = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{9, 8, 10, 11}
		};
		System.out.println(Arrays.deepToString(arr2d));
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr2d[i].length;j++)     //Here the length of inner array is not constant so putting limit as its length
			{
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		// Enhanced loop is used to traverse through the element of array
		
		//1D
		for(int x :array)
		{
			System.out.print(x+" ");
		}
		//2D
		System.out.println();
		for(int x[]: arr2d)
		{
			for(int y: x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
