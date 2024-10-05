package oops_concept;

class Bank
{
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	public void deposit()
	{
		System.out.println("Deposit");
	}
}


class Sbi extends Bank
{
	public void sbiinterest()
	{
		System.out.println("Sbi interest");
	}
}

class Hdfc extends Bank
{
	public void loan()
	{
		System.out.println("Loan");
	}
}

public class Hierarchial_bank {

	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		Hdfc h=new Hdfc();
        s.deposit();
        s.sbiinterest();
        h.deposit();
        h.loan();
	}

}
