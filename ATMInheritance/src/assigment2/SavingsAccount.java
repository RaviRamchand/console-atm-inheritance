package assigment2;

public class SavingsAccount extends Account{
	//SavingsAccount cannot be overdrawn and has a interest rate of 3% 
	
	public SavingsAccount() {}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public String withdraw(double amount) {
		double newAmount;
		String str;
		newAmount = this._balance - amount;
		this._balance = newAmount;
		
		str = "Your new balance is: " +newAmount;
		return str;
	}
	
	public double annualInterestRate() {
		return this._annualInterestRate = 3;
	}
}
