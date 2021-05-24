package no2;

public class AccountManager
{
		public static void main(String[] args) 
		{
			BankReader reader = new BankReader();
			BankAccount account = new BankAccount(0);
			BankWriter writer = new BankWriter("Bank account manager", account);
			AccountController controller = new AccountController(reader, writer, account);
			controller.processTransactions();
		}
}

