import javax.swing.JOptionPane;

public class isPrime {

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Type a integer. It will show isPrime.");
		int n = new Integer(input).intValue();
		if (n < 2)
			throw new RuntimeException("Error: invalid "+n);
		else
		{
			boolean found = false;
			int c = n/2;
			while (!found && c > 1)
			{
				if  (n%c == 0)
					found = true;
				else
					c = c-1;
			}
			if  (!found) JOptionPane.showMessageDialog(null,"Yes");
			else System.out.println("no.");
		}
	}
	

}
