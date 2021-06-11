package assigment2;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String []args) {		
		Scanner input = new Scanner(System.in);
		int[] arrId = new int[10];

		//Already existing account ids
		arrId[0] = 101;
		arrId[1] = 102;


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
			ATM atmObject = new ATM();
			atmObject.createAccount(input, arrId);
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			break;
		}		

		System.out.println("array ids: ");

		System.out.println(Arrays.toString(arrId));


		//End of main method
	}

	public void createAccount(Scanner input, int[] arrId) {		
		System.out.println(" ");
		System.out.println("---------------");
		System.out.println("Create Account");
		System.out.println("---------------");
		System.out.print("Enter ID: ");
		int id = input.nextInt();

		//loop through arrId to see if id already exists
		for(int i = 0; i<arrId.length; i++) {
			if(arrId[i] == id) {
				System.out.println("This id already exists");
				break;
			}
			else {
				System.out.println("aight");
				if(arrId[i] == 0) {
					arrId[i] = id;
					break;
				}				
			}
		}

		//End of creatAccount method
	}



	//End of ATM class
}
