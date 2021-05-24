package mid;

import java.awt.*;
import javax.swing.*;

public class graphic extends JPanel 
{
	
	public graphic()
	{
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("m");
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	public void paintComponent(Graphics g)
	{
		g.fillOval(100, 100, 300, 300);
	}
	
	public static void main(String[] args) 
	{
		new graphic();
	}
	

}
