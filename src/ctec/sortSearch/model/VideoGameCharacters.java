package ctec.sortSearch.model;

public class VideoGameCharacters implements Comparable
{
	private String name;
	private int yearBorn;
	private boolean isOld;
	
	
	public VideoGameCharacters(String name, int yearBorn, boolean isOld)
	{
		this.name = name;
		this.yearBorn = yearBorn;
		this.isOld = isOld;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getYearBorn()
	{
		return yearBorn;
	}
	
	public boolean isOld()
	{
		return isOld;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setYearBorn(int yearBorn)
	{
		this.yearBorn = yearBorn;
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
		characterString += "I was born  " + yearBorn + " and ";
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
