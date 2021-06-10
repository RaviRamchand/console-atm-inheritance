package assigment2;

public class ChequingAccount extends Account{
	//Overdraft limit of $500
	//Annual Interest Rate 1%
	
	
	
	public ChequingAccount() {}

	public ChequingAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public String withdraw(double amount) {
		double newAmount;
		String str;
		
		//Check if the balance - the amount is less than or equal to 500 
		if(this._balance - amount <= -500) {
			str = "You dont have enough money to withdraw";
		}
		//If not minus away bai
		else {
			newAmount = this._balance - amount;
			this._balance = newAmount;
			str = "Your new balance is: $" +newAmount;
		}
		return str;
		
	}
	


}