package HyGym;

public abstract class Pocketmon implements Attack, Interaction {

	private String name;
	private double hp;
	private int str;

	public Pocketmon(String name, double hp, int str) {
		this.name = name;
		this.hp = hp;
		this.str = str;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}


	

}
