class Quicksort
{
	private int [] a;
	static int counter = 0;

	public Quicksort(int [] array)
	{
		a = array;
	}

	public static void print(int[] a)
        {
                for(int x=0;x<a.length;++x)
                        System.out.print("\t" + x);
                System.out.println();
                for(int x=0;x<a.length;++x)
                        System.out.print("\t" + a[x]);
                System.out.println();
                System.out.println("number of operations performed by the sorting algorithm: " + counter);
                counter = 0;
        }

	public static void printCount()
        {
                System.out.println("\tnumber of operations performed by the sorting algorithm: " + counter + "\n");
                counter = 0;
        }

	public void swap(int i, int j)
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void sort(int from, int to)
	{
		if (from >= to)
			return;
		int p = partition(from, to);
		sort(from, p);
		sort(p+1, to);
	}

	public int partition(int from, int to)
	{
		int pivot = a[from];
		int i = from-1;
		int j = to+1;
		while (i<j)
		{
			i++;
			while(a[i] < pivot)
			{
				i++;
				counter++;
			}
			j--;
			while(a[j] > pivot)
			{
				j--;
				counter++;
			}
			if (i<j)
			{
				counter++;
				swap(i,j);
			}
		}
		return j;
	}
}
