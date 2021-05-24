
public class helloworld {

	public static void main(String[] args)
	{
	String s = "How are you? I am fine thank you and you? ok";
	char c = 'o';
	boolean found = false;
	int index = 0;
	while (!found && index<s.length())
	{
	if (s.charAt(index) == c)
	found = true;
	else
	index = index + 1;
	}
	if (!found)
	System.out.println("not found.");
	else
	System.out.println("index: " + index);
	}

}
