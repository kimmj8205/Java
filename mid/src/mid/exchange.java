package mid;
import java.text.*;

public class exchange {

	public static void main(String[] args) {
		String name = new String(args[0]);
		int won = new Integer(args[1]).intValue();
		double d = (won/1110);
		int dollar = (int)d;
		DecimalFormat formatter = new DecimalFormat("0");
		System.out.println(name + "���� ������ �ݾ���" + formatter.format(dollar) + "$ �Դϴ�");

	}
	

}
