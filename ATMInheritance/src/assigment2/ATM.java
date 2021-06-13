package assigment2;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String []args) {
		ATM atmObject = new ATM();
		Account[] arrId = new Account[5];
		int id = 101;

		for(int i = 0; i<arrId.length; i++) {
			arrId[i] = new Account();
			arrId[i].setId(id);
		}		

		atmObject.menu(arrId, atmObject);	

		//End of main method

	}

	//Main menu
	public void menu(Account[] arrId, ATM atmObject) {		
		Scanner input = new Scanner(System.in);

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
			//		case 2:
			//			atmObject.accountInfo(input, arrId);
			//			break;
		case 3:
		case 4:
		case 5:
			break;
		}		

		System.out.println("array ids: ");

		System.out.println(Arrays.toString(arrId));

	}

	//Method to create an account 
	public void createAccount(Scanner input, Account[] arrId) {
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
			while(arrId[i] != null && arrId[i].getId() == id) {
				System.out.print("Please enter another ID: ");
				id = input.nextInt();	
			}

			//If users wanted Id doesn't exist, add to the array
			if(arrId[i].getId() != id) {
				arrId[i] = new Account();				
				arrId[i+i].setId(id);
				break;

			}				

			//End of for loop
		}

		System.out.println(Arrays.toString(arrId));


		//		System.out.print("Enter your initial balance: ");
		//		initialBalance = input.nextDouble();
		//
		//		//Put the balance the index after the id
		//		for(int i = 0; i<arrId.length; i++) {
		//			if(arrId[i] == id) {
		//				arrId[i+1] = initialBalance;
		//
		//			}			
		//		}
		//
		//		//Go back to the menu method
		//		menu(arrId, atmObject);
		//		//End of creatAccount method
		//	}
		//
		//	//Account info method
		//	public void accountInfo(Scanner input, Account[] arrId) {
		//		int id; 
		//		System.out.println("Enter your Id: ");
		//		id = input.nextInt();
		//
		//		//login to the account
		//		for(int i = 0; i<arrId.length; i++) {
		//			if(arrId[i] == id) {
		//				System.out.println("Account Id: " +id);
		//				System.out.println("Annual Interest Rate: ");
		//			}
		//			else {
		//				System.out.println("You need to login first");
		//				main(null);
		//			}
		//		}		

	}


	//End of ATM class
}
