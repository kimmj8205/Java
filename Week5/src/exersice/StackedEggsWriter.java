package exersice;

import java.awt.*;
import javax.swing.*;

public class StackedEggsWriter extends JPanel
{
	private int frame_width;
	private int frame_height;
	
	private int egg1_size;
	private int egg2_size;
	private int egg3_size;
	
	public StackedEggsWriter(int width, int height, int size1, int size2, int size3)
	{
		frame_width = width;
		frame_height = height;
		egg1_size = size1;
		egg2_size = size2;
		egg3_size = size3;
		JFrame my_frame = new JFrame();
		my_frame.getContentPane().add(this);
		my_frame.setTitle("StckedEggsWriter");
		my_frame.setSize(frame_width, frame_height);
		my_frame.setBackground(Color.yellow);
		my_frame.setVisible(true);
	}
	private int paintAnEgg(int bottom, int width, Graphics pen) 
	{
		int height = (2 * width) / 3;
		int top_edge = bottom - height;
		int left_edge = (frame_width - width) /2;
		pen.setColor(Color.gray);
		pen.fillOval(left_edge, top_edge, width, height);
		pen.setColor(Color.black);
		pen.drawOval(left_edge, top_edge, width, height);
		return top_edge;
	}
	public void paintComponent(Graphics g) 
	{
		int egg1_top = paintAnEgg(frame_height, egg1_size, g);
		int egg2_top = paintAnEgg(egg1_top, egg2_size, g);
		paintAnEgg(egg2_top, egg3_size, g);
	}
	public static void main(String[] args) 
	{
		new StackedEggsWriter(300, 200, 50, 90, 140);
	}
}