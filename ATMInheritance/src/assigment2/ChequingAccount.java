package assigment2;

public class ChequingAccount extends Account{
	//ChequintAccount has an Overdraft limit of $-500 and an Annual Interest Rate of 1%
	
	public ChequingAccount() {}

	public ChequingAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public String withdraw(double amount) {
		double newAmount;
		String str;
		int overdraft = -500;
		
		//Check if the balance - the amount is <= -500(overdraft) 
		if(this._balance - amount <= overdraft) {
			str = "You dont have enough money to withdraw";
		}
		//If balance - amount > overdraft calculate new amount
		else {
			newAmount = this._balance - amount;
			this._balance = newAmount;
			str = "Your new balance is: $" +newAmount;
		}
		return str;
		
	}
	
	public double annualInterestRate() {
		return this._annualInterestRate = 1;
	}
	


}