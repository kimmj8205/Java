package HyGym;

public class Gym {
	
	public static void main(String[] args) {
		Pocketmon  pickachu = new Pikachu("��ī��", 20, 5);
		Pocketmon  fairi = new Charmander("���̸�", 18, 6);
		
		Battle battle = new Battle();
		battle.start(pickachu, fairi);
		battle.end();
	}

}
