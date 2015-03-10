package ctec.sortSearch.view;

import java.awt.LayoutManager;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ctec.sortSearch.controller.sortSearchController;

public class sortPane extends Panel
{
	private sortSearchController baseController;
	private JButton scrambleButton;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField userField;
	private JTextArea displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLayout;
	
	public sortPane(sortSearchController baseController)
	{
		this.baseController = baseController;
		scrambleButton = new JButton("Scramble arrays");
		sortButton = new JButton("Sort");
		searchButton = new JButton("Search");
		userField = new JTextField(25);
		displayArea = new JTextArea(10,25);
		displayPane = new JScrollPane(displayArea);
		baseLayout = new SpringLayout();
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
