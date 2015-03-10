package ctec.sortSearch.controller;

import ctec.sortSearch.model.SortingMachine;
import ctec.sortSearch.model.*;

public class sortSearchController
{
	private int [] integrs;
	private double [] reals;
	private String [] words;
	private SortingMachine mySorter;
	
	
	/**
	 * Method for the controller.
	 */
	public sortSearchController()
	{
		mySorter = new SortingMachine();
	}
	
	/**
	 * starts the fillTheArrays method.
	 */
	public void start()
	{
		fillTheArrays();
		mySorter.selectionSort(integrs);
		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
		mySorter.selectionSort(myCharacters);
		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
	}
	
	/**
	 * Fills the int, double, and String arrays.
	 */
	private void fillTheArrays()
	{
		fillTheIntArray();
//		fillTheDoubleArray();
		fillTheStringArray();
		fillTheVideoGameCharacterArray();
	}
	
	private void fillTheVideoGameCharacterArrray()
	{
		myCharacter = new VideoGameCharacter[30];
		for(int index = 0; index < myCharacter.length; index ++)
		{
			{
				String name = index + "Mario";
				String gameSeries = index + "Super Mario Bros.";
				boolean isOld = true;
				myCharacter[index] = new Character(name, gameSeries, isOld);
			}
		}
	}
	
	/**
	 * Fills in the Int array.
	 */
	private void fillTheIntArray()
	{
		integrs = new int [30];
		for(int start = 0; start < integrs.length; start++)
		{
			integrs[start] = (int) (Math.random() * 36000);
		}
	}
	
	/**
	 * Fills the Double array.
	 */
//	private void fillTheDoubleArray()
//	{
//		reals = new double [4];
//		{
//			for(int i = 0; i < 4; i++)
//			{
//				for(int j = 0; j < 4; j++)
//				{
//					reals[i][j] = i*j; 
//				}
//			}
//		}
//	}
	
	/**
	 * Fills the String array.
	 */
	private void fillTheStringArray()
	{
		
	}
}