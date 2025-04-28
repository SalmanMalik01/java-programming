package com.java.ATM_machine;

import java.util.Scanner;

class ATM{
	
	float Balance;
    int PIN=8800;
	
	public void checkpin() {
		System.out.println("Enter pin: ");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		if(pin==PIN) {
			menu();
		} else {
			System.out.println("Invalid PIN");
			checkpin();
		}
	}
	
	
	public void menu() {
		System.out.println("1.Check A/C Balance");
		System.out.println("2.Withrow Money");
		System.out.println("3.Deposite Money");
		System.out.println("4.Exit");
		Scanner sc=new Scanner(System.in);
		int opt= sc.nextInt();

		
		if(opt==1) {
			checkbalance();
			
		}else if(opt==2) {
			Withdrow();
			
		}else if(opt==3) {
			deposite();
			
		}else if(opt==4) {
			returns ();
		} else {
			System.out.println("Invalid Input");
		}
		
	}
	
	
	
	public void checkbalance(){
	 System.out.println("Balance: "+Balance);	
		menu();
	}
	
	public void Withdrow() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdrow: ");
		int amt=sc.nextInt();
		
		if(amt>Balance) {
			System.out.println("Insufficient Amount");
			menu();
		} else {
			Balance=Balance-amt;
			System.out.println("Withdrow Successfuly");
			System.out.println("Remaining Amount: "+Balance);
			
			menu();
		}
	}
	
	public void deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to Deposite: ");
		int amt=sc.nextInt();
		Balance=Balance+amt;
		System.out.println("Deposited Successfuly");
		System.out.println("After deposite Amount: "+Balance);
		menu();
	}
	
	public void returns() {
		System.out.println("Thank you :)");
	}
	 
	
	
}



public class ATM_Machine {

	public static void main(String[] args) {

		ATM amt=new ATM();
		amt.checkpin();
		
	}
}
