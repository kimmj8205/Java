package Exercise01;
import java.text.*;

public class Exchange {

	public static void main(String[] args) {
		String name = args[0];
		int w = new Integer(args[1]).intValue();
		double d = w/1110.16;
		int dollar = (int)d;
		DecimalFormat formatter = new DecimalFormat("0");
		System.out.println(name +"���� ������ �ݾ��� $" + formatter.format(dollar) +  "�Դϴ�.");
	}

	
}
