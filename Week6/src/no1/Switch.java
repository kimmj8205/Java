package no1;
import java.util.*;
public class Switch {
	
	public static void main(String[] args) {
		
		System.out.println("���ڸ� �Է����ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num%2)
		{	
		case 0 : { System.out.println("¦��");
				break;
			}
		case 1 : { System.out.println("Ȧ��");
				break;
			}
		
		default : { System.out.println("Wrong Input!");
			}
		}
		
	}

}
