package practiseR;

class Account {
	int acc_num;
	double balance;
	String date;

	Account(int acc_num, double balance) {
		this.acc_num = acc_num;
		this.balance = balance;
	}

	void withdraw(double amt) {
		balance -= amt;
	}

	void deposit(double amt) {
		balance += amt;
	}
}

class SavingsAccount extends Account {
	SavingsAccount(int id, double balance) {
		super(id, balance);
	}
}

class CheckingAccount extends Account {
	double o_limit;

	CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.o_limit = overdraftLimit;
	}
}

public class Main {
	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	static void withdrawAccount(Account account, double amount) {
		account.withdraw(amount);
		System.out.println(amount + " rs is withdrawed from account number " + account.acc_num);
	}

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(123, 50000);
		CheckingAccount c = new CheckingAccount(124, 85000, -20);

		System.out.println("SavingsAccount : ");
		System.out.println("Account Number : " + s.acc_num);
		System.out.println("Balance : " + s.balance + "\n");

		System.out.println("CheckingAccount : ");
		System.out.println("Account Number : " + c.acc_num);
		System.out.println("Balance : " + c.balance);

		withdrawAccount(s, 20000);
		withdrawAccount(c, 50000);

		System.out.println("\nAfter withdrawal...\n");
		System.out.println("SavingsAccount : ");
		System.out.println("Account Number : " + s.acc_num);
		System.out.println("Balance : " + s.balance + "\n");

		System.out.println("CheckingAccount : ");
		System.out.println("Account Number : " + c.acc_num);
		System.out.println("Balance : " + c.balance);
	}
}
