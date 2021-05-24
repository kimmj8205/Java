package no1;
import java.util.*;
public class Switch {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num%2)
		{	
		case 0 : { System.out.println("짝수");
				break;
			}
		case 1 : { System.out.println("홀수");
				break;
			}
		
		default : { System.out.println("Wrong Input!");
			}
		}
		
	}

}
