package HyGym;

public class Pikachu extends Pocketmon implements Attack, Interaction {
	private String name;
	private double hp;
	private int str;

	public Pikachu(String name,double hp,int str) {
		super(name, hp, str);
	}

	@Override
	public void happy() {
		System.out.println("��ī�� > <");

	}

	@Override
	public void sad() {
		System.out.println("��ī�� �� ��");
	}
	

	@Override
	public boolean attack(Pocketmon target) {
		if ((target.getHp()-this.getStr())<0)
			target.setHp(0);
		
		else 
			target.setHp(target.getHp() - this.getStr());
		System.out.println(this.getName() +"�� "+this.getStr()+"�� �������� "+target.getName()+"�� HP�� "+target.getHp()+"�� �����ߴ�!"  );
		return false;
	}
}