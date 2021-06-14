package assigment2;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String []args) {
		//Create an ATM object
		ATM atmObject = new ATM();

		//Create an account array to hold 5 account ids
		Account[] arrId = new Account[5];
		int id = 0;

		//Fill the array with id 0 so it can later be accessed and writen over
		for(int i = 0; i<arrId.length; i++) {
			arrId[i] = new Account();
			arrId[i].setId(id);
		}		

		//Use the atm object to access the menu method, and pass the array and the object
		atmObject.menu(arrId, atmObject);	

		//End of main method

	}

	//Menu method
	public void menu(Account[] arrId, ATM atmObject) {
		//Scanner object
		Scanner input = new Scanner(System.in);

		//Menu options
		System.out.println("First time: "+Arrays.toString(arrId));
		System.out.println("-------------------");
		System.out.println("Main Menu");
		System.out.println("-------------------");
		System.out.println("1. Create Account");
		System.out.println("2. Account Info");
		System.out.println("3. Withdraw");
		System.out.println("4. Deposit");
		System.out.println("5. Exit");
		System.out.println(" ");

		System.out.print("Please choose what you'd like to do: ");
		int choice = input.nextInt();

		//Switch statement based on what the user inputs
		switch(choice) {
		case 1:			
			atmObject.createAccount(input, arrId, atmObject);
			break;
		case 2:
			atmObject.accountInfo(input, arrId, atmObject);
			break;
		case 3:
		case 4:
		case 5:
			break;
		}		

		System.out.println("array ids: ");

		System.out.println(Arrays.toString(arrId));

	}

	//Method to create an account 
	public void createAccount(Scanner input, Account[] arrId, ATM atmObject) {
		double initialBalance;

		System.out.println(" ");
		System.out.println("---------------");
		System.out.println("Create Account");
		System.out.println("---------------");
		System.out.print("Enter ID: ");
		int id = input.nextInt();

		//Loop through arrId to see if id already exists
		for(int i = 0; i<arrId.length; i++) {

			//Loops until the user enters an ID that does'nt exist
			while(arrId[i] != null && arrId[i].getId() == id) {
				System.out.print("Please enter another ID: ");
				id = input.nextInt();	
			}

			//If users wanted Id doesn't exist and arrid[i] = 0, add to the array
			if(arrId[i].getId() != id && arrId[i].getId() == 0) {
				System.out.print("Enter your initial balance: ");
				initialBalance = input.nextDouble();
				arrId[i] = new Account();				
				arrId[i].setId(id);
				arrId[i+1].setBalance(initialBalance);
				break;

			}			
			
			//TODO allow the user to input the type of account they want

			//End of for loop
		}

		System.out.println(Arrays.toString(arrId));

		//Go back to the menu method
		menu(arrId, atmObject);
		//End of creatAccount method
	}

	//Account info method
	public void accountInfo(Scanner input, Account[] arrId, ATM atmObject) {
		int id; 
		System.out.print("Enter your Id: ");
		id = input.nextInt();

		//Login to the account
		for(int i = 0; i<arrId.length; i++) {
			if(arrId[i].getId() == id) {
				System.out.println("Account Id: " +id);
				System.out.println("Annual Interest Rate: " +arrId[i].getAnnualInterestRate());
				break;
			}
			else {
				System.out.println("You need to login first");
				menu(arrId, atmObject);
			}
		}		

	}


	//End of ATM class
}
