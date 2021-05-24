package HyGym;

public class Charmander extends Pocketmon implements Attack, Interaction {
	private String name;
	private double hp;
	private int str;

	public Charmander(String name,double hp,int str) {
		super(name, hp, str);
	}

	@Override
	public void happy() {
		System.out.println("파이~리 > <");

		
	}

	@Override
	public void sad() {
		System.out.println("파이~리 ㅠ ㅠ");
	}

	@Override
	public boolean attack(Pocketmon target) {
		if (((int)target.getHp()-this.getStr())<0)
			target.setHp(0);
		
		else 
			target.setHp((int)target.getHp() - this.getStr());
		System.out.println(this.getName() +"의 "+this.getStr()+"의 공격으로 "+target.getName()+"의 HP가 "+target.getHp()+"로 감소했다!"  );
		return false;
	}
}