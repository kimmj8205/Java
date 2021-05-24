package HyGym;

public class Battle {
	private int turn = 0;
	private Pocketmon winner;
	private Pocketmon loser;

	public void start(Pocketmon p1, Pocketmon p2) {
		System.out.println("Battle Start");
		System.out.println("Player 1: "+p1.getName()+" (HP: "+p1.getHp()+")");
		System.out.println("Player 2: "+p2.getName()+" (HP: "+p2.getHp()+")");
		while(true)
		{
			p1.attack(p2);
			if (p2.getHp()==0) {
				winner = p1;
				loser = p2;
				break;
			}
			p2.attack(p1);
			if (p1.getHp()==0) {
				winner = p2;
				loser = p1;
				break;
			}
		}
	}

	
	public void end() {
		winner.happy();
		loser.sad();
		System.out.println("Battle End");
	}
}
