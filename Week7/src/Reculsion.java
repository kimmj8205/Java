import java.util.Scanner;

public class Reculsion {
	public static long cal(int a, int b)
	{
		if (b==0)
			return 1;
		else
			return a*cal(a, b-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		long ans = cal(a, b);
		System.out.println(a + " ^ " + b + " = " + ans);
	}
	

}
