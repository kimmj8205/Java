import javax.swing.*;
import java.io.*;
import java.util.*;

public class Iris2 {
	
	private String f;
	public static BufferedReader infile;
	
	public Iris2()
	
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("choose");
		chooser.showDialog(null, "OK");
		this.f = chooser.getSelectedFile().toString();
		try {
			this.infile = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
