import java.util.*;

public class Lab5
{

	public static void main(String[]args)
	{
		Scanner cin = new Scanner(System.in);
		Random rng = new Random();

		System.out.println("evan\nlab5\n'quicksort' sorting algorithm");
		System.out.println("specify size of array: ");
		int size = cin.nextInt();
		System.out.println();

		int arr_Ordered[] = new int[size];
		int arr_Reversed[] = new int[size];
		int arr_Random[] = new int[size];

		for(int x=0;x<size;++x)
		{
			arr_Ordered[x] = x+1;
		}

		int temp_Rev = size + 1;
		for(int x=0;x<size;++x)
		{
			arr_Reversed[x] = temp_Rev-1;
			temp_Rev--;
		}

		for(int x=0;x<size;++x)
		{
			arr_Random[x] = rng.nextInt(50);
		}

		int [] qSort_Ordered = new int[size];
		int [] qSort_Reversed = new int[size];
		int [] qSort_Random = new int[size];

		Quicksort quick1 = new Quicksort(arr_Ordered);
		quick1.sort(0, arr_Ordered.length-1);
		System.out.println("quick sort performed on ordered list.\n\toriginal size of list: " + size);
		Quicksort.printCount();

		Quicksort quick2 = new Quicksort(arr_Reversed);
		quick2.sort(0, arr_Reversed.length-1);
		System.out.println("quick sort performed on reverse ordered list.\n\toriginal size of list: " + size);
		Quicksort.printCount();

		Quicksort quick3 = new Quicksort(arr_Random);
		quick3.sort(0, arr_Random.length-1);
		System.out.println("quick sort performed on random ordered list.\n\toriginal size of list: " + size);
		Quicksort.printCount();
		
	}
}
