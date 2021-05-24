package no2;

import javax.swing.JOptionPane;

public class BankAccount
{
	private int balance;
	
	public BankAccount(int initial_amount)
	{
		if (initial_amount >= 0)
		{
			balance = initial_amount;
		}
		else
		{
			balance = 0;
		}
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public int getInterest(int exceed)
	{
		return (int) (exceed * 0.1);
	}
	
	public boolean deposit(int amount)
	{
		boolean result = false;
		if (amount < 0)
			JOptionPane.showMessageDialog(null, "Invalid input.");
		else
		{
			balance = balance + amount;
			result = true;
		}
		return result;
	}
	
	public boolean withdraw(int amount)
	{
		boolean result = false;
		if (amount < 0)
			JOptionPane.showConfirmDialog(null, "invalid input.");
		else if(balance - amount < 0)
		{
			if (balance > 0)
			{
			double a = (balance - amount)*0.1;
			int b = (int) a;
			balance = balance - amount - b;
			}
			else {
				double a = amount*0.1;
				int b = (int) a;
				balance = balance - amount - b;
			}
		}
		else
		{
			balance = balance - amount;
			result = true;
		}
		return result;
	}
}