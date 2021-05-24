package inchmeter;

import java.text.*;
import javax.swing.*;

public class inchmeter {

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Type a integer inch");
		int inch = new Integer(input).intValue();
		double meter = 0.0254*inch;
		DecimalFormat formatter = new DecimalFormat("0.0000");
		JOptionPane.showMessageDialog(null, inch + " Inch is " + formatter.format(meter) + " Meter");
		

	}

}