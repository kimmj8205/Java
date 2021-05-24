package clock;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.text.*;


public class clock extends JPanel
{
	public clock()
	{
	int width = 500;
	JFrame f = new JFrame();
	f.getContentPane().add(this);
	f.setTitle("Clock");
	f.setSize(width, width);
	f.setVisible(true);
	}
	
	public void paintComponent(Graphics g)
	{
		GregorianCalendar time = new GregorianCalendar();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = formatter.format(time.getTime());
		
		Font myfont = new Font ("±¼¸²", 1, 30);
		g.setFont(myfont);
		g.drawString(result, 50, 200);
	}
	
	public static void main(String[] args)
	{
		new clock();
	}
}
