package no2;

import javax.swing.JOptionPane;

public class BankReader 
{
	private String input_line = "";
	
	public char readCommand(String message)
	{
		input_line = JOptionPane.showInputDialog(message).toUpperCase();
		return input_line.charAt(0);
	}
	
	public int readAmount() 
	{
		int amount = 0;
		String s = input_line.substring(1, input_line.length());
		if (s.length() > 0) 
		{
			amount = new Integer(s).intValue();
		}
		else
			JOptionPane.showConfirmDialog(null, "input for amount is not provided.");
		return amount;
	}
}