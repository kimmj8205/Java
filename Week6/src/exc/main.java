package exc;

import javax.swing.*;

public class main {
	
	private static int getInt(String msg)
	{
		return new Integer(JOptionPane.showInputDialog(msg)).intValue();
	}
	
	private static void showError(String msg)
	{
		JOptionPane.showMessageDialog(null, "error: "+msg);
	}

	public static void main(String[] args) {
		
		int dollars = getInt("dollars?");
		if (dollars < 0)
			showError(dollars + " is a negative value.");
		else
		{
			int cents = getInt("cents?");
			if (cents > 99)
				showError(cents + "is over than 99.");
			else
			{
				int money = (dollars * 100) + cents;
				String output = "quarters = " + (money / 25);
				money = money % 25;
				output = output + "\ndimes = " + (money / 10);
				money = money % 10;
				output = output + "\ndick = " + (money / 5);
				money = money % 5;
				output = output + "\npennies = " + money;
				JOptionPane.showMessageDialog(null, output);
			}
		}

	}

}
