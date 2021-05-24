package no2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankWriter extends JPanel
{
	 private int WIDTH = 300;
	 private int HEIGHT = 200;
	 private BankAccount bank;
	 private String last_transaction = "";
	 
	 public BankWriter(String title, BankAccount b)
	 {
		 bank = b;
		 JFrame f  = new JFrame();
		 f.getContentPane().add(this);
		 f.setTitle(title);
		 f.setSize(WIDTH, HEIGHT);
		 f.setBackground(Color.white);
		 f.setVisible(true);
	 }
	 
	 public void showTransaction(String message, int amount)
	 {
		 last_transaction = message + " " + amount;
		 this.repaint();
	 }
	 
	 public void showTransaction(String message)
	 {
		 last_transaction = message;
		 this.repaint();
	 }
	 
	 public void paintComponent(Graphics g)
	 {
		 g.setColor(Color.white);
		 g.fillRect(0, 0, WIDTH, HEIGHT);
		 g.setColor(Color.black);
		 int text_margin = 50;
		 int text_baseline = 50;
		 g.drawString(last_transaction, text_margin, text_baseline);
		 g.drawString("current balance (��): " + bank.getBalance(), text_margin, text_baseline + 20);
	 }
}