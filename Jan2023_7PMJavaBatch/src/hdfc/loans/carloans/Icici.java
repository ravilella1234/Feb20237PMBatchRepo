package hdfc.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i = new Icici();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overloading  withdrawl in Icici");
	}

	@Override
	public void deposit() {
		System.out.println("iam overloading  deposit in Icici");
	}

}
