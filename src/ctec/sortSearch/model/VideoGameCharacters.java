package ctec.sortSearch.model;

public class VideoGameCharacters implements Comparable
{
	private String name;
	private String gameSeries;
	private boolean isOld;
	
	
	public VideoGameCharacters(String name, String gameSeries, boolean isOld)
	{
		this.name = name;
		this.gameSeries = gameSeries;
		this.isOld = isOld;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGameSeries()
	{
		return gameSeries;
	}
	
	public boolean isOld()
	{
		return isOld;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGameSeries(String gameSeries)
	{
		this.gameSeries = gameSeries;
	}
	
	public void setIsOld(boolean isOld)
	{
		this.isOld = isOld;
	}
	
	@Override
	public String toString()
	{
		String characterString = "";
		characterString += "Hello my name is " + name + ".";
		characterString += "I am from the " + gameSeries + " game series and";
		if(isOld)
		{
			characterString += "I am an old character with many games.";
		}
		else
		{
			characterString += "I am a new character with very few games.";
		}
		
		return characterString;
	}
	
	/**
	 * Compares the names of video game characters.
	 */
	public int compareTo(Object otherVideoGameCharacter)
	{
		int compareValue = 0;
		
		if(this.name.length() < ((VideoGameCharacters) otherVideoGameCharacter).getName().length())
		{
			compareValue = -1;
		}
		else if(this.name.length() > ((VideoGameCharacters) otherVideoGameCharacter).getName().length())
		{
			compareValue = 1;
		}
		
		return compareValue;
	}
}
