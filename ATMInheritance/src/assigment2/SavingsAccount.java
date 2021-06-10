package assigment2;

public class SavingsAccount extends Account{
	//Cannot be overdrawn 
	
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
}
