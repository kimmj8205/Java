import java.io.*;
import java.util.*;
import javax.swing.*;

public class Iris {
	
	private String f;
	public static BufferedReader infile;
		
	public Iris() throws IOException {
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Select a file.");
		chooser.showDialog(null, "A");
		this.f = chooser.getSelectedFile().toString();
		this.infile = new BufferedReader(new FileReader(f));
	}
	public ArrayList readlines() throws IOException {
		String a = infile.readLine();
		String b = "";
		ArrayList<String> array = new ArrayList<String>();
		while(infile.ready())
		{
			a = infile.readLine();
			StringTokenizer t = new StringTokenizer(a, ",.");
			while(t.hasMoreTokens()) {
				b = t.nextToken();
			}
			if (array.contains(b)==false)
				array.add(b);
		}
		return array;
	}
	public void writelines(ArrayList array, String file_name) throws IOException {
		PrintWriter outfile = new PrintWriter(new FileWriter("iris_species.txt"));
		for (int i=0;i<array.size();i++) {
			outfile.println(array.get(i));
			
		}
		infile.close();
		outfile.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		Iris iris = new Iris();
		ArrayList<String> spiecs = iris.readlines();
		iris.writelines(spiecs, "iris_species.txt");

		
	}

}
