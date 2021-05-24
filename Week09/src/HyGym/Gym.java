package HyGym;

public class Gym {
	
	public static void main(String[] args) {
		Pocketmon  pickachu = new Pikachu("피카츄", 20, 5);
		Pocketmon  fairi = new Charmander("파이리", 18, 6);
		
		Battle battle = new Battle();
		battle.start(pickachu, fairi);
		battle.end();
	}

}
