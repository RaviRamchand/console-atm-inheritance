package assigment2;

public class Account {
	//Fields
	protected String _customerName;
	protected int _id;
	protected double _balance;
	protected double _annualInterestRate;

	//No-arg constructor
	public Account() {}

	//Argument constructor
	public Account(int id, double balance) {
		this._id = id;
		this._balance = balance;
	}

	//getters and setters

	public String getCustomerName() {
		return _customerName;
	}

	public void setCustomerName(String _customerName) {
		this._customerName = _customerName;
	}

	public int getId() {
		return _id;
	}

	public void setId(int _id) {
		this._id = _id;
	}

	public double getBalance() {
		return _balance;
	}

	public void setBalance(double _balance) {
		this._balance = _balance;
	}

	public double getAnnualInterestRate() {
		return _annualInterestRate;
	}

	public void setAnnualInterestRate(double _annualInterestRate) {
		this._annualInterestRate = _annualInterestRate;
	}

	//Methods 
	public double deposit(double amount) {
		return this._balance = this._balance + amount;
	}

	public String withdraw(double amount) {
		String str;
		double newAmount = 0;
		if(this._balance> amount) {
			newAmount = this._balance -= amount;
		}		

		str = "Your new amount is :" +newAmount;
		this._balance = newAmount;
		return str;
	}

	public double monthlyInterest() {
		double newInterest;
		newInterest = this._balance * ((this._annualInterestRate/12)/100);
		return newInterest;
	}

	//End of Account class
}
