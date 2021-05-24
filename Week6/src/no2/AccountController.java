package no2;

public class AccountController 
{
	private BankReader reader;
	private BankWriter writer;
	private BankAccount account;
	
	public AccountController(BankReader r, BankWriter w, BankAccount a)
	{
		reader = r;
		account = a;
		writer = w;
	}
	
	public void processTransactions() {
		char command = reader.readCommand("Please insert D/W/Q and amount of money.");
		switch (command) 
		{
		case 'Q' :
				System.exit(0);
		case 'D' : 
			{
				int amount = reader.readAmount();
				if (account.deposit(amount))
					writer.showTransaction("deposit (¿ø): ", amount);
				else
					writer.showTransaction("deposit error: ", amount);
				break;
			}
		case 'W' : 
			{
			int amount = reader.readAmount();
			if (account.withdraw(amount))
				writer.showTransaction("withdrawn (¿ø): ", amount);
			else
				writer.showTransaction("withdraw error: ", amount);
			break;
			}
		default:
				writer.showTransaction("invalid input: " + command);
		}
		this.processTransactions();
	}
}
