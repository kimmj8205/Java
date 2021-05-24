package graphic;

import java.awt.*;
import javax.swing.*;

public class graphic extends JPanel
{
	public graphic()
	{
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("»§¾ÆÀú¾¾³× °£ÆÇ");
		f.setSize(500, 500);
		f.setVisible(true);	
	}
	
	public void paintComponent(Graphics g)
	{
		paintBoard(10,10,20,20,g);
	}
	
	private void paintBoard(int start_x, int start_y, int total_rows, int
			square_size, Graphics g)
			{
			for (int x = 0; x < total_rows; x++)
			{
			int x_position = start_x + (x * square_size);
			for (int y = 0; y < total_rows; y++ )
			{
			int y_position = start_y + (y * square_size);
			if ( ((x + y) % 2) == 0 )
			g.setColor(Color.red);
			else
			g.setColor(Color.white);
			g.fillRect (x_position, y_position, square_size,square_size);
			}
			}
			}
	public static void main(String[] args) 
	{
		new graphic();
	}

}
