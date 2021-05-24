public class Game369 {

	public static void main(String[] args) {
		int n = 1;
		while (n < 51)
		{
			String a = String.valueOf(n);
			if (n % 10==0)
				if ((a.indexOf('3') >= 0) || (a.indexOf('6') >= 0) || (a.indexOf('9') >= 0))
					if ((a.length()==2))
							{
							if (((a.charAt(0)=='3')||(a.charAt(0)=='6')||(a.charAt(0)=='9')) && ((a.charAt(1)=='3')||(a.charAt(1)=='6')||(a.charAt(1)=='9')))
								System.out.println("¦¦");
							else
								System.out.println("¦");
							}
					else 
						System.out.println("¦");
				else
					
					System.out.println(n);
			else
				if ((a.indexOf('3') >= 0) || (a.indexOf('6') >= 0) || (a.indexOf('9') >= 0))
					if ((a.length()==2))
					{
						if (((a.charAt(0)=='3')||(a.charAt(0)=='6')||(a.charAt(0)=='9')) && ((a.charAt(1)=='3')||(a.charAt(1)=='6')||(a.charAt(1)=='9')))
							System.out.print("¦¦ ");
						else
							System.out.print("¦ ");
					}
					else
						System.out.print("¦ ");
				else
					System.out.print(n + " ");
			n = n + 1;
		}
	}
}
