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
		System.out.println("피카피 > <");

	}

	@Override
	public void sad() {
		System.out.println("피카피 ㅠ ㅠ");
	}
	

	@Override
	public boolean attack(Pocketmon target) {
		if ((target.getHp()-this.getStr())<0)
			target.setHp(0);
		
		else 
			target.setHp(target.getHp() - this.getStr());
		System.out.println(this.getName() +"의 "+this.getStr()+"의 공격으로 "+target.getName()+"의 HP가 "+target.getHp()+"로 감소했다!"  );
		return false;
	}
}