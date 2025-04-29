package AMT_Machine2;

import java.util.Scanner;

class AMT{
	
	Scanner sc =new Scanner(System.in);
	
	float balance;
	static int PIN=8899;
	
	
	 AMT() {
		
		System.out.print("Enter pin: ");
		try {
		int pin=sc.nextInt();
		if(PIN==pin) {
			menu();
		}else {
			System.out.println("Invalid Pin! Try Again...");
			
		}
		}catch(Exception e) {
			System.out.println("Invalid Pin! Try Again...");
		}
	}
	
	
	public void menu() {
		System.out.println();
		System.out.println("****************** Main Menu **********************");
		System.out.println("1.Deposite Amount            2.Withdrol Amount");
		System.out.println("3.Check A/c Balance          4.Exit");
		System.out.println();
		int opt=sc.nextInt();
		
		switch(opt) {
		
		case 1: depositeAmount();
		menu();
		case 2: withdrolAmount();
		menu();
		case 3: checkBalance();
		menu();
		case 4: System.out.println("Thank you:)");;
		break;
		
		}
		
	}
	
	void depositeAmount() {
		System.out.print("Enter Amount to Deposite: ");
		float Amount=sc.nextFloat();
		balance=balance+Amount;
		System.out.println("Amount Deposite successfully");
		menu();
		
	}
	
	void withdrolAmount(){
		System.out.print("Enter Amount to withdrol: ");
		float Amount=sc.nextFloat();
		if(balance<Amount) {
			System.out.println("Insufficient balance");
			menu();
		}else{
		balance=balance-Amount;
		System.out.println("Amount Withdrol successfully");
		menu();
	}
	}
	void checkBalance() {
		System.out.println("Balance "+balance);
		menu();
	}
}


public class AMT_machine2 {
	public static void main(String[] args) {
		AMT a1=new AMT();
	
	
	}
	
}
