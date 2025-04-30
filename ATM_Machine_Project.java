package AMT_Machine2;

import java.util.Scanner;

class AMT{
	
	Scanner sc =new Scanner(System.in);
	
	float balance;
	static String PIN="8899";
	int attempts=0;
	String pin;
	

	 AMT() throws InterruptedException { 
		 
		while(attempts<3) {
		System.out.print("Enter your pin: ");
		
		 pin=sc.next();
		
		if(PIN.equalsIgnoreCase(pin)) {
			menu();
			break;
		}else {
			attempts++;
			 System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.");
		} 

        if (attempts == 3) {
            System.out.println("Your card is blocked for 24 hours.");
        }else {
        	}
      
		}
			
	}
		
	
	public void menu() throws InterruptedException {
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
		case 4: exit();
		
		
		}
		
	}
	
	void depositeAmount() throws InterruptedException {
		System.out.print("Enter Amount to Deposite: ");
		float Amount=sc.nextFloat();
		balance=balance+Amount;
		System.out.println("Amount Deposite successfully");
		menu();
		
	}
	
	void withdrolAmount() throws InterruptedException{
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
	void checkBalance() throws InterruptedException {
		System.out.println("Balance "+balance);
		menu();
	}
	
	void exit() throws InterruptedException{
		System.out.print("Thank you!!! Closing");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		
	}
}



public class AMT_machine2 {
	public static void main(String[] args) throws InterruptedException {
		AMT a1=new AMT();
	
	
	}
	
}
