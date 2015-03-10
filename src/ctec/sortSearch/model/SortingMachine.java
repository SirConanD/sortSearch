package ctec.sortSearch.model;

public class SortingMachine
{
	private long startTime;
	private long endTime;
	private long sortTime;
	
	
	/**
	 * A method that will sort how long it takes to sort.
	 * @return The method for sortTime.
	 */
	public long getSortTime()
	{
		return sortTime;
	}
	
	/**
	 * The method that sorts the items and times it form start to finish.
	 * @param toBeSorted
	 * @return The time it took to sort.
	 */
	public int[] selectionSort(int [] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		/**
		 * Method that figures out how long it took to sort.
		 */
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public VideoGameCharacters [] selectionSort(VideoGameCharacter [] sortTheCharacters)
	{
		int maximumPosition;
		VideoGameCharacter maximum;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < sortTheCharacters.length; position++)
		{
			maximumPosition = position;
			maximum = sortTheCharacters[position];
			for(int next = position +1; next < sortTheCharacters.length; next++)
			{
				if(sortTheCharacters[next].compareTo(maximum) > 0)
				{
					maximum = sortTheCharacters[next];
					maximumPosition = next;
				}
			}
		    if(maximumPosition != position)
		    {
		    	swap(sortTheCharacters, position, maximumPosition);
		    }
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return sortTheCharacters;
	}
	
	public String [] selectionSort(String [] stringSort)
	{
		int maximumPosition;
		int maximum;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < stringSort.length; position++)
		{
			maximumPosition = position;
			maximum = stringSort[position];
			for(int next = position +1; next < stringSort.length; next++)
			{
				if(stringSort[next].compareTo(maximum) > 0)
				{
					maximum = stringSort[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(stringSort, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return stringSort;
	}
	
	private void swap(stringSort [] array, int position, int change)
	{
		stringSort temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(VideoGameCharacters [] array, int position, int change)
	{
		VideoGameCharacters temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	/**
	 * 
	 * Moves the position of array, position, and change.
	 * @param array 
	 * @param position
	 * @param change
	 */
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	/**
	 * Method that compiles the results of sort time into days to milliseconds.
	 * @param sortTime
	 * @return
	 */
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "\n";
		timeToSort += "Hours; " + sortTime/(1000*60*60) % 24+ "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60+ "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "\n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
	}
}
