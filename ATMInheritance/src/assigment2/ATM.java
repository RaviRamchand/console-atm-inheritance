package assigment2;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String []args) {		
		Scanner input = new Scanner(System.in);
		double[] arrId = new double[10];
		ATM atmObject = new ATM();

		//Already existing account ids
		arrId[0] = 101;		
		arrId[2] = 102;
		
		//101's balance
		arrId[1] = 500;
		
		//102's balance
		arrId[3] = 1000;
		
		atmObject.menu(input, arrId);	

		//End of main method
	}
	
	//Main menu
	public void menu(Scanner input, double[] arrId) {	
		
		ATM atmObject = new ATM();
		
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

		switch(choice) {
		case 1:			
			atmObject.createAccount(input, arrId);
			break;
		case 2:
			atmObject.accountInfo(input, arrId);
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
	public void createAccount(Scanner input, double[] arrId) {
		double initialBalance;
		
		System.out.println(" ");
		System.out.println("---------------");
		System.out.println("Create Account");
		System.out.println("---------------");
		System.out.print("Enter ID: ");
		int id = input.nextInt();

		//loop through arrId to see if id already exists
		for(int i = 0; i<arrId.length; i++) {
			
			//loops until the user enters an ID that does'nt exist
			while(arrId[i] == id) {
				System.out.print("Please enter another ID: ");
				id = input.nextInt();
			}

			if(arrId[i] != id) {
				if(arrId[i] == 0) {
					arrId[i] = id;
					break;
				}				
			}
		}
		
		System.out.print("Enter your initial balance: ");
		initialBalance = input.nextDouble();
		
		//Put the balance the index after the id
		for(int i = 0; i<arrId.length; i++) {
			if(arrId[i] == id) {
				arrId[i+1] = initialBalance;
				
			}			
		}
		
		//Go back to the menu method
		menu(input, arrId);
		//End of creatAccount method
	}

	//Account info method
	public void accountInfo(Scanner input, double[] arrId) {
		int id; 
		System.out.println("Enter your Id: ");
		id = input.nextInt();
		
		//login to the account
		for(int i = 0; i<arrId.length; i++) {
			if(arrId[i] == id) {
				System.out.println("Account Id: " +id);
				System.out.println("Annual Interest Rate: ");
			}
			else {
				System.out.println("You need to login first");
				main(null);
			}
		}		
		
	}


	//End of ATM class
}
